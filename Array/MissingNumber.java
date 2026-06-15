package Array;

public class MissingNumber {

    /* Number 1 se N tak ho sirf ek number missing ho Duplicate na ho */
    static int findMissingNumber(int arr[]){

        int n = arr.length + 1;
    
        int expectedSum = n*(n + 1)/2;
        int actualSum = 0;

        for(int i = 0; i<arr.length; i++) {
            actualSum = actualSum + arr[i];
        }
        return expectedSum - actualSum;

    }
    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();

        int missing  = findMissingNumber(arr);

        System.out.println("Missing Number: " + missing);



        
    }
    
}
