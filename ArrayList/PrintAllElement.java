import java.util.ArrayList;

public class PrintAllElement {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList();

    list.add(10);
    list.add(20);
    list.add(30);

    int sum = 0;
    for(int i = 0; i<list.size(); i++){
      sum = sum + list.get(i);
       System.out.println(list.get(i));
    }

    System.out.println("Sum of element: " + sum);

  }
}
