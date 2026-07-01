package Array;

public class ArraySearch {

    /*
     * 
     * Given an array, arr[] of n integers, and an integer element x, find whether
     * element x is present in the array. Return the index of the first occurrence
     * of x in the array, or -1 if it doesn't exist.
     * 
     */

    static int arraySearch(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();
        int x = ArrayUtility.inputValue(0);

        int result = arraySearch(arr, x);
        System.out.println("Index: " + result);
    }

}
