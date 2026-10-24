import java.util.ArrayList;
import java.util.Scanner;

public class CountEven {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(23);
    list.add(32);
    list.add(5);
    list.add(6);
    int count = 0;

    for(int i = 0; i<list.size(); i++){
      if(list.get(i) % 2 == 0){
        count++;
      }
    }
    System.out.println(count);
    
  }
  
}
