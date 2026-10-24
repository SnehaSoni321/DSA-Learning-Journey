package Level1Patterns;

import java.util.Scanner;

public class Pattern2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. 4");
    int n = sc.nextInt();
    if(n == 4){
      for(int i = 0; i<=n; i++){
      for(int j = n; j>=i; j--){
        System.out.print("*\t");
      }
      System.out.println();
    }
   }else {
    System.out.println("Please Enter 4");
   }
    
  }
  
}
