package Oops.Encapsulation;

// Encapsulation -> Data Hiding

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(12);
        obj.setName("Sneha");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }

}