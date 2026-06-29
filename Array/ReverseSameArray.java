package Array;

public class ReverseSameArray {

    static void reverseSameArray(int arr[]) {
        for(int start = 0,  end = arr.length - 1; 
        start < end; 
        start++, end--) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        ArrayUtility.printArray(arr);  //[2,3,5,6]
    }
    
    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();

        reverseSameArray(arr);

    }
    
}
