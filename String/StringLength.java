import java.util.Scanner;
public class StringLength {

    /* Find the given String length  */

    static int findLength(String s) {
        return s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String s = sc.nextLine();

        int len = findLength(s);

        System.out.println("Length = " + len);


        
    }
    
}
