package TowPointersInArray;

import Array.ArrayUtility;

public class ReverseArray {

    static void reverse(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        ArrayUtility.printArray(arr);
    }
    
    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();
        reverse(arr);

    }
}
