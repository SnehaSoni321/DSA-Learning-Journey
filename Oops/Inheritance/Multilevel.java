package Oops.Inheritance;

class A {
    public void show() {
        System.out.println("A class");
    }
}
class B extends A {
     public void show() {
        System.out.println("B first function");
    }
     public void display() {
        System.out.println("B second function");
    }
}

class C extends B {
     public void show() {
        System.out.println("C class");
    }
}

public class Multilevel {
    
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}
