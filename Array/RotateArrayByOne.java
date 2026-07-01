package Array;

public class RotateArrayByOne {
    /*
    Given an array arr, rotate the array by one position in clockwise direction.

    */

    static void rotateArray(int arr[]) {
        int last = arr[arr.length - 1];

        for(int i = arr.length - 1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
    
    public static void main(String[] args) {

        int arr[] = ArrayUtility.inputArray();
        rotateArray(arr);

        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
