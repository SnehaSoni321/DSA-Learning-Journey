package Oops.Abstract;

abstract class car {
   abstract public void fueltype();
   public void color() {
    System.out.println("Black Color");
   }
}

class tata extends car {
    public void fueltype() {
        System.out.println("Diesel");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        tata a = new tata();
        a.fueltype();
        a.color();
    }
}
