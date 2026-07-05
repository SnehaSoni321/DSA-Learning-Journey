package Oops.Polymorphism; 

// Polymorphism ->Many + behaviour [poly(Many) + morphism(behaviour)]

// Run time polymorphism

class A {
    public void show() {
        System.out.println("This is A");
    }
}

class B extends A {
    public void show() {
        System.out.println("This is B");
    }
}

class C extends A{
    public void show() {
        System.out.println("This is C");
    }
}
public class Ex1 {
public static void main(String[] args) {
    A obj = new A();
    obj.show();

    obj = new B();
    obj.show();

    obj = new C();
    obj.show();
}
    
}