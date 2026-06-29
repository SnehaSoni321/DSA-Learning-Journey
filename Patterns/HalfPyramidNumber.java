package Patterns;

public class HalfPyramidNumber {

/*
1
12
123
1234
12345

*/
    static void halfPyramid(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num = PatternUtility.inputNum();
        System.out.println("The Half Pyramid Pattern: ");
        halfPyramid(num);
    }
}
