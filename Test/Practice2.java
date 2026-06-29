package Test;
import java.util.Scanner;

public class Practice2 {

    static int[] inputArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Elements of array: ");
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;

    }

    static void findMissingNumber(int arr[]) {
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } else if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Missing number: ");
        for(int num = min; num<max; num++) {
            boolean found = false;

            for(int i = 0; i<arr.length; i++) {
                if(arr[i] == num) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = inputArray();
        findMissingNumber(arr);
    }
    
}
