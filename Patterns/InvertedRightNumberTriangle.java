package Patterns;

public class InvertedRightNumberTriangle {

    static void invertedRightNumberTriangle(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=(n-i+1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = PatternUtility.inputNum();
        System.out.println("Inverted Right Number Triangle:");
        invertedRightNumberTriangle(n);

    }
    
}
