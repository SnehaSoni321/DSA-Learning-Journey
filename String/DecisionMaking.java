
import java.util.Scanner;

public class DecisionMaking {

    /*
     * Given two integers, n and m. The task is to check the relation between n and
     * m. Print "less" if n < m, "equal" if n == m, and "greater" if n > m.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();  

        if (n < m) {
            System.out.print("less");
        } else if (n == m) {
            System.out.print("equal");
        } else if (n > m) {
            System.out.print("greater");
        }
    }
}
