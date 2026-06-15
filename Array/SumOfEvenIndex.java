package Array;

public class SumOfEvenIndex {

    /*Given an array of integers, find the sum of elements at even index */
    static int sumofevenindex(int arr[]) {

        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            if(i%2 == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();
        int res = sumofevenindex(arr);
        System.out.println("Sum of even index values: " + res);

    }
    
}
