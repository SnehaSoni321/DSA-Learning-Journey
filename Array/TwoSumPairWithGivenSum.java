package Array;

public class TwoSumPairWithGivenSum {

    /*
     * Given an array arr[] of integers and another integer target. Determine if
     * there exist two distinct indices such that the sum of their elements is equal
     * to the target.
     */

    static boolean sumPair(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();
        int n = ArrayUtility.inputValue(0);
        boolean result = sumPair(arr, n);
        System.out.println(result);
    }

}
