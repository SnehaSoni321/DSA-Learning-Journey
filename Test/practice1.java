package Test;
import java.util.Scanner;

public class practice1 {

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

    static void ascending(int arr[]) {

        for(int i = 0; i<arr.length-1; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } 
            }
        }
            System.out.print("Array in ascending order: ");
            for(int i = 0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        
    }
    public static void main(String[] args) {
        
      int arr[] = inputArray();
      
      ascending(arr);
       

    
    
}

    
}
