package Level1;

import java.util.Scanner;

public class PrimeOrNot2 {
    public static void main(String[] args) {
        // simple logic

         Scanner sc = new Scanner(System.in); 
        System.out.println("Enter how many number you check: ");
        int t = sc.nextInt();

        for(int i = 0; i<t; i++){
            int n = sc.nextInt();

            int count = 0;
            for(int div = 2; div * div<=n; div++){
                if(n%div == 0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }

        }
    }
    
}
