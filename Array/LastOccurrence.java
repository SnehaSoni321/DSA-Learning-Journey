package Array;

public class LastOccurrence {
    static int lastoccurrence(int arr[], int x){

        int index = -1;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == x) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int arr[] = ArrayUtility.inputArray();

        System.out.println("Enter search element: ");
        int x = ArrayUtility.inputValue(0);

        int result = lastoccurrence(arr, x);
        System.out.println("LastOccurrence: " + result);
        
    }
    
}
