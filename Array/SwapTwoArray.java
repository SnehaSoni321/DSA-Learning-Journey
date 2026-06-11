package Array;

public class SwapTwoArray {

    /* Given two same size Array Swap the Array */
    static void swaptwoArray(int[] arr1, int[] arr2) {
         for(int  i = 0; i<arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
         }
         
         System.out.println("arr1: ");
         for(int i = 0; i<arr1.length; i++) {
            System.out.print(arr1[i] + " ");
         }
         System.out.println();

         System.out.println("arr2: ");
         for(int i = 0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
         }
    }
    
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();

        swaptwoArray(arr1, arr2);
    }
}
