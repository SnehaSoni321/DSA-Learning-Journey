

import java.util.Scanner;

public class StringUtility {

    static Scanner sc = new Scanner(System.in);

    public static String inputString() {

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        return str;
    }

    public static void printString(String str) {

        System.out.println(str);

    }
}