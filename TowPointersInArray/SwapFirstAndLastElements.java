package TowPointersInArray;

import Array.ArrayUtility;

public class SwapFirstAndLastElements {

    static void swapFirstLast(int arr[]) {
         int temp = arr[0];
         arr[0] = arr[arr.length-1];
         arr[arr.length-1] = temp;

    }
    static void printArrat(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();
        swapFirstLast(arr);
        printArrat(arr);
    }
    
}
