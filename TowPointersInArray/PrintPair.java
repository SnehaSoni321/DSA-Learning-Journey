package TowPointersInArray;
import Array.ArrayUtility;

public class PrintPair {

    static void pair(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            if(left == right) {
                System.out.println(arr[left]);
            } else {
                System.out.println(arr[left] + " " + arr[right]);
            }

            left++;
            right--;
        }
    }


    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();
        pair(arr);

    }
    
}