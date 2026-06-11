package Array;

import java.util.Scanner;

/* Count Positive, negative and zero */

public class CountPositiveNegativeAndZero {

    static void inputArray(int arr[], Scanner sc) {
        for(int i = 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
    }

        static void count(int arr[]) {
            int pos = 0;
            int neg = 0;
            int zero = 0;

            for(int i = 0; i<arr.length; i++) {
                if(arr[i] > 0) {
                    pos++;
                } else if(arr[i] < 0) {
                    neg++;
                } else {
                    zero++;
                }
            }

            System.out.println("Positive= " + pos);
            System.out.println("Negative= " + neg);
            System.out.println("Zreo= " + zero);
        }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array element: ");
        inputArray(arr, sc);

        count(arr);


        
    }
    
}
