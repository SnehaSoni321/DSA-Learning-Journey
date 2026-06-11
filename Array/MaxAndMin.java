package Array;

public class MaxAndMin {

     /* Given an array arr[]. Your task is to find the minimum and maximum elements in the array. */

    public static void main(String[] args) {
        
    int arr[] = {3,5,2,7,8,4};
    
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum: "+ max);
        System.out.println("Minimum: "+ min);
  }
}