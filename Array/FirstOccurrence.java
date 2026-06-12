package Array;

public class FirstOccurrence {


    /* First Occurrence index print-> x phle bar kis index par mila */

    static int firstOccurrence(int arr[], int x){
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = ArrayUtility.inputArray();

        System.out.println("Enter search element: ");
        int x = ArrayUtility.inputValue(0);
        int result = firstOccurrence(arr, x);

        System.out.println("First Occurrence: " + result);
        
    }
    
}
