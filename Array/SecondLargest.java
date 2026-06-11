package Array;

public class SecondLargest {
/* Find the second Largest Element in array when it not exist print -1 */


    static int secondLargest(int arr[]) {
        int laegest = arr[0];
        int secondlargest = -1;

        for(int  i = 0; i<arr.length; i++) {
            if(arr[i] > laegest) {
                laegest = arr[i];
            }
        }

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > secondlargest && arr[i] != laegest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }


    public static void main(String[] args) {
         int arr[] = ArrayUtility.inputArray();

         int result = secondLargest(arr);
         System.out.println("Second Largest is: " + result);
    }

   

}
