package Oops.Inheritance;

//Single inheritance

class A {
        public void display() {
            System.out.println("This is class A");
        }
    }

    class B extends A {
        public void show() {
            System.out.println("This is class B");
        }
    }

public class Single1 {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
    }
    
}
