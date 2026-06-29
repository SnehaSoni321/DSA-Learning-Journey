package Array;

import java.util.Scanner;

/* print element at even index   */

public class PrintElementAtEvenIndex {

    static void inputArray(int arr[], Scanner sc) {
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
    }
    }

    static void printIndex(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            if(i % 2 == 0) {
                System.out.println("Even index element: "+ arr[i] + " ");

            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements: "); 
        inputArray(arr, sc);

        printIndex(arr);

        
    }
    
}
