package Array;

public class LargestElement {
    static int findLargest(int arr[]) {
        int lag = arr[0];

        for(int i = 1; i<arr.length; i++) {
            if(arr[i] > lag) {
                lag = arr[i];
            }
        }
        return lag;
    }


    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();

        int laegest = findLargest(arr);
        System.out.println("Largest Element: " + laegest);
    }
    
}
