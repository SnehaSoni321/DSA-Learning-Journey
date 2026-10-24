package Level1Patterns;

import java.util.Scanner;

public class Pattern3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. 5");
    int n = sc.nextInt();
    int tab = n - 1;
    int star = 1;
    if(n == 5){
      for(int i = 1; i<=n; i++){
        // System.out.print(tab + "\t" + star);
        for(int j = 1; j<=tab; j++){
          System.out.print("\t");
        }
        for(int j=1; j<=star; j++){
          System.out.print("*\t");
        }
         tab--;
         star++;
         System.out.println();
    }
   }else {
    System.out.println("Please Enter 4");
   }
    
  }
  
}
