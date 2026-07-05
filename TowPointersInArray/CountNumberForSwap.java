package TowPointersInArray;

import Array.ArrayUtility;

public class CountNumberForSwap {

    static int countSwap(int arr[]) {
        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        while( left < right) {
    
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            
                count++;

                left++;
                right--;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();
        int swap = countSwap(arr);

        System.out.print("Count of swap: " + swap);
    }
    
}
