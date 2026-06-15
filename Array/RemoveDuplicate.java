package Array;

public class RemoveDuplicate {

    /* Remove Duplicates in array */

    static void removeDuplicte(int arr[]){
        for(int i = 0; i<arr.length; i++) {

            boolean isDuplicate = false;
            for(int j = 0; j<i; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                System.out.println(arr[i] + " ");
            }

        }

    }

    public static void main(String[] args) {

        int arr[] = ArrayUtility.inputArray();

        System.out.println("Array After Removing Duplicates: ");

        removeDuplicte(arr);
        
    }
    
}
