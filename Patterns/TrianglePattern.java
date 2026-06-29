package Patterns;

public class TrianglePattern {

    /*
    1
    22
    333
    4444
    */

    static void triangle(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 0; j<i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = PatternUtility.inputNum();
        System.out.println("The Triangle Pattern is: ");
        triangle(num);
    }
}
