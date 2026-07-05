package Oops.Polymorphism;

class MathOperation {
    int add(int a, int b) {
        return a+b;
    }
    int add(int a, int b, int c) {
        return a+b+c;
    }
     double add(double a, double b) {
        return a+b;
    }

}

public class Ex2 {

    public static void main(String[] args) {
        MathOperation obj = new MathOperation();

        System.out.println(obj.add(2,3));
        System.out.println(obj.add(2,3,4));
        System.out.println(obj.add(2.5, 3.5));
        
        
        
    }
    
}
