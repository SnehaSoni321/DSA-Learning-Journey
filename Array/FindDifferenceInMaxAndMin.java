package Array;

public class FindDifferenceInMaxAndMin {

    static int findDifference(int arr[]) {
    
        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } 
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
         int arr[] = ArrayUtility.inputArray();

         int res = findDifference(arr);
         System.out.println("Difference between max and min: "+ res);

    }


    
}
