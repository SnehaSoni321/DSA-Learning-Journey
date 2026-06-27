

import java.util.Scanner;

public class StringUtility {

    static Scanner sc = new Scanner(System.in);

    public static String inputString() {

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        return str;
    }

    public static char inputCharacter() {
        System.out.println("Enter Character: ");
        char ch = sc.next().charAt(0);
        return ch;
    }

    public static int inputInt() {
        System.out.println("Enter index: "); {
          //  int n = sc.next().charAt(0);
            return sc.nextInt();
        }
    }
    public static void printString(String str) {

        System.out.println(str);

    }
}