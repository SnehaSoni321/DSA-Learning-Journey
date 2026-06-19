package Array;

public class SwapArrays{
    
    static void twoArraySwap(int arr1[], int arr2[]) {

        if(arr1.length != arr2.length) {
            System.out.println("Array size must be same");
            return;
        }

        for(int i = 0; i<arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }

        System.out.println("First Array: ");
        ArrayUtility.printArray(arr1);

        System.out.println("Second Arrat: ");
        ArrayUtility.printArray(arr2);

    }

    public static void main(String[] args) {
        System.out.println("Enter first Array: ");
        int arr1[] = ArrayUtility.inputArray();

        System.out.println("Enter second Array:");
        int arr2[] = ArrayUtility.inputArray();

        twoArraySwap(arr1, arr2);
    }
}