package Array;

public class CheckArrayIsSorted {

    /*Check Array is Sorted or not */
    static boolean CheckArray(int arr[]) {

        for(int i = 0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {

        int arr[] = ArrayUtility.inputArray();

        boolean isSorted =  CheckArray(arr);

        if(isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not Sorted");
        }

        
    }

    
}
