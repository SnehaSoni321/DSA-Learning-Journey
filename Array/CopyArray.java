package Array;

public class CopyArray {

    /* copy one Array to another*/
    static int[] copyArray(int arr[]) {

        int copy[] = new int[arr.length];

        for(int i = 0; i<arr.length; i++) {

            copy[i] = arr[i];
        }
        return copy;
    }

    public static void main(String[] args) {

        int arr[] = ArrayUtility.inputArray();

        int copy[] = copyArray(arr);
         System.out.println("Copy Array: ");
         ArrayUtility.printArray(copy);

        
    }
    
}
