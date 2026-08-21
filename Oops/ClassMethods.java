package Oops;

class Dog {
    int License_ID;
    String name;

    public void eat() {
        System.out.println(name + " eats");
    }
}

public class ClassMethods {
    public static void main() {
        Dog dog1 = new Dog();
        dog1.name = "Bruno";
        dog1.eat();
        dog1.name = "Tom";
        dog1.eat();
    }
}
