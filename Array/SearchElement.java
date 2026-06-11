package Array;

public class SearchElement {
    /* Search element and write the index */
    
    static int searchelement(int[] arr, int x) {
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == x){
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {

        int arr[] = ArrayUtility.inputArray();

        System.out.println("Enter search element: ");
        
        int x = ArrayUtility.inputValue(0);
         
         int index = searchelement(arr, x);

         if(index != -1) {
            System.out.println("Element found at index: "+ index);
         } else {
             System.out.println("Element not found: ");
         }


        
        
        
    }
    
}
