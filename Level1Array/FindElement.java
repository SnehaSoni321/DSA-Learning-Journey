package Level1Array;
import java.util.Scanner;

public class FindElement{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of element: ");
    int n1 = sc.nextInt();
    int[] arr = new int[n1];
    System.out.println("Enter array Elements:- ");
    for(int i = 0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter Finding Element: ");
    int find = sc.nextInt();
    int index = -1;
    for(int i = 0; i<arr.length; i++){
      if(arr[i] == find){
        index = i;
        break;
      }
    }
    System.out.print("In index: " +index);
  }
}