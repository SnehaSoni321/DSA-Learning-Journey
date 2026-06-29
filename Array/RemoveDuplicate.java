package Array;

public class RemoveDuplicate {

    /* Remove Duplicates in array */

    static void removeDuplicte(int arr[]){

    System.out.println("Array After Removing Duplicates: ");

        for(int i = 0; i<arr.length; i++) {

            boolean isDuplicate = false;
            for(int j = 0; j<i; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                System.out.print(arr[i] + " ");
            }

        }

    }

    public static void main(String[] args) {

        int arr[] = ArrayUtility.inputArray();

        removeDuplicte(arr);
        
    }
    
}
