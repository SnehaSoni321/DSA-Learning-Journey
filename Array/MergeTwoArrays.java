package Array;

public class MergeTwoArrays {

    static int[] mergeTwOArrays(int arr1[], int arr2[]) {
        int merge[] = new int[arr1.length + arr2.length];

        int index = 0;
        for(int i = 0; i<arr1.length; i++) {
            merge[index] = arr1[i];
            index++;
        }
        for(int j = 0; j<arr2.length; j++) {
            merge[index] = arr2[j];
            index++;
        }
        return merge;
    }
    public static void main(String[] args) {
        System.out.println("Enter first array");
        int arr1[] = ArrayUtility.inputArray();
        System.out.println("Enter second arrya");
        int arr2[] = ArrayUtility.inputArray();

        int result[] = mergeTwOArrays(arr1, arr2);
        System.out.println("Merged Array: ");
        
        ArrayUtility.printArray(result);
    }
    
}
