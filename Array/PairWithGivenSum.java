package Array;

public class PairWithGivenSum {

    static void findPair(int arr[], int target) {
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();
        System.out.println("Enter Target Sum ");
        int target = ArrayUtility.inputValue(0);
        findPair(arr, target);
    }
    
}
