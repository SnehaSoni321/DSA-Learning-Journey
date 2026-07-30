package Oops.Abstract.Methods;

class Computer {

    public void playMusic() {
        System.out.println("Play Music");
    }

    public String gatMePen(int cost) {
        if(cost >= 10)
        return "Pen";
     
        return "No pen is available";
    }
}
public class Ex1 {

    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();

        String str = obj.gatMePen(2);
        System.out.println(str);
    }
    
}
