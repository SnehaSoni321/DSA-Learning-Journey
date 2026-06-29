package Patterns;

public class InvertedRightTriangle {

    /* 
    
    *****
    ****
    ***
    **
    *
    
    */

    static void invertedRightTriangle(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 0; j<(n-i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = PatternUtility.inputNum();
        System.out.println("Inverted Right Triangle: ");
        invertedRightTriangle(num);
    }
    
}
