package Constructor;

class Student {
    String name;
    
    Student(String n) {
        name = n;
        System.out.println(name);
    }
}

public class Ex2 {
public static void main(String[] args) {
    Student s1 = new Student("Sneha");
    Student s2 = new Student("Soni");
}

}
