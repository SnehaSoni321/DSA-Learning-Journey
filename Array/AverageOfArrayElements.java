package Array;

public class AverageOfArrayElements {

    /* Find the Average of Array element */
    public static void main(String[] args) {
        int arr[] = {3,4,2,6,7};
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = (double) sum /arr.length;
        System.out.println("Average of Array Elements: " + avg);
    }
    
}
