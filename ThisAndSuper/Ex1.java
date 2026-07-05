package ThisAndSuper;

class A extends Object {
    public A() {
        super();
        System.out.println("This is A");
    }
    public A(int n) {
        super();
        System.out.println("This is resiving A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("This is B");
    }
    public B(int n) {
        this();
        System.out.println("This is resiving B int");
    }
}
public class Ex1 {
    public static void main(String[] args) {
        B obj = new B(5);
    }
    
}
