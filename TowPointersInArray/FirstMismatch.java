package TowPointersInArray;

import Array.ArrayUtility;

public class FirstMismatch {
    static void firstMismatch(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            if(arr[left] != arr[right]) {
                System.out.println("First mismach: " + arr[left] + " and " + arr[right]);
                return;
            }
            left++;
            right--;
        }
        System.out.println("No mismatch");
    }

    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();
        firstMismatch(arr);
    }
    
}
