package Array;
import java.util.Scanner;

public class ArrayUtility {
    static Scanner sc = new Scanner(System.in);

public static int[] inputArray() {

    System.out.print("Enter Size: ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    System.out.println("Enter Element: ");

    for(int i = 0; i<arr.length; i++) {
       arr[i] = sc.nextInt();

    } 

    return arr;           
}

public static int inputValue(int x) {
    int a = sc.nextInt();
    return a;
}

public static void printArray(int arr[]) {
    for(int i = 0; i<arr.length; i++) {
        System.out.print(arr[i]  + " ");
    }

    System.out.println();
}


}
