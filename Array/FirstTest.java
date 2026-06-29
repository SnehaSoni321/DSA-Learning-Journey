package Array;
import java.util.Scanner;

public class FirstTest {

        static boolean findDup(int arr[]) {
            for(int i = 0; i<arr.length; i++) {
                boolean found = false;

                for(int j = 0; j<i; j++) {
                    if(arr[i] == arr[j]) {
                        return true;
                    }
                }
            }
            return false;
        }

        static int[] inputArray() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Array size: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter Array elements: ");
            for(int i = 0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            return arr;
            
        }
        public static void main(String[] args) {
            int arr[] = inputArray();
           boolean ans = findDup(arr);
           System.out.println(ans);
        }
    }