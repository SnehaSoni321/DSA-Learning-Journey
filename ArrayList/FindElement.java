import java.util.ArrayList;
import java.util.Scanner;

public class FindElement {
  public static void main(String[] args) {
  ArrayList<Integer> list = new ArrayList<>();
  list.add(10);
  list.add(20);
  list.add(30);
  list.add(40);
  list.add(50);

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter finding element");
    int n = sc.nextInt();

    boolean found = false;

    for(int i = 0; i<list.size(); i++){
      if(list.get(i) == n){
        System.out.println("Element found: " + i);
        found = true;
        break;
      }
    }

    if(found == false){
            System.out.println("Element not found");
    }

  }
}
