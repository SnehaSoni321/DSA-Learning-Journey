import java.util.ArrayList;

public class MaxNum {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList();
    
    list.add(34);
    list.add(44);
    list.add(30);
    list.add(23);
    list.add(67);
    list.add(76);

    int max = list.get(0);
    for(int i = 0; i<list.size(); i++){
      if(list.get(i) > max){
        max = list.get(i);
      }
    }
    System.out.println("Max: " + max);
    
  }
  
}
