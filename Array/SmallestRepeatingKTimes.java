package Array;

public class SmallestRepeatingKTimes {

    /*
     * Given an array arr, the goal is to find out the smallest number that is
     * repeated exactly k times.
     * 
     * Note: If there is no such element then return -1.
     */

    static int findK(int[] arr, int k) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == k && arr[i] < min) {
                min = arr[i];
            }
        }

        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();
        int n = ArrayUtility.inputValue(0);
        int result = findK(arr, n);
        System.out.println(result);
    }

}
