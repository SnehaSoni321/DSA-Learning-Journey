package Test;
import java.util.Scanner;

public class Firsttest {

    static boolean findArrayIsSorted(int arr[]) {

        for(int i = 0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
         return true;
        
    }

    static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element of array: ");
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int arr[] = inputArray();

      boolean isSorted =  findArrayIsSorted(arr);

      if(isSorted) {
        System.out.println("Sorted");
      } else{
        System.out.println("Not Sorted");
      }

    }
    
}
