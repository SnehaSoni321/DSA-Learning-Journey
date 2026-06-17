package Array;

public class CheckTwoArrayAreEqual {

    /* Check Two Array Are Equal */

    static boolean Equal(int arr1[], int arr2[]) {
        if(arr1.length != arr2.length) {
            return false;
        } 
        for(int i = 0; i<arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter first Array: ");
        int arr1[] = ArrayUtility.inputArray();
        System.out.println("Enter Second Array: ");
        int arr2[] = ArrayUtility.inputArray();

        boolean result = Equal(arr1, arr2);
        if(result) {
            System.out.println("Arrays are equal");
        } else{
            System.out.println("Arrays are not equal");
        }
    }
    
}
