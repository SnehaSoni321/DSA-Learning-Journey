package Test;
import java.util.Scanner;

public class Practice {

      static int[] inputArray() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element: ");
        
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        
        int[] result = inputArray();
        System.out.print("Array is: ");

        for(int i = 0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }

    
    }
    
}
