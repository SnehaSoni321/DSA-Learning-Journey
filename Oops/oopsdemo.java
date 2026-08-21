
package Oops;
class Student {
    String name;
    int roll_no;
    String address;
}
// class Attributes  ->   String name;  int roll_no;  String address;
public class oopsdemo {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "Sneha";
        System.out.println(std1.name);
        std1.name = "Soni";
        System.out.println(std1.name);
    }
}