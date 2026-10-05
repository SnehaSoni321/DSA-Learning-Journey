package Level1;

import java.util.Scanner;

public class PrimeOrNot1 {
    public static void main(String[] args) {
        // simple logic

         Scanner sc = new Scanner(System.in); 
        System.out.println("Enter how many number you check: ");
        int t = sc.nextInt();

        for(int i = 0; i<t; i++){
            int n = sc.nextInt();

            int count = 0;
            for(int div = 1; div<=n; div++){
                if(n%div == 0){
                    count++;
                }
            }

            if(count == 2){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }

        }
    }
    
}
