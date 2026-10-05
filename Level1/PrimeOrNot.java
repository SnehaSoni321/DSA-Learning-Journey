package Level1;

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        // take t times number and check every time that number is prime or not 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter how many number you check: ");
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            for(int j = 2; j<n; j++){
                if(n%j == 0){
                    System.out.println("Not Prime");
                    break;
                }else{
                    System.out.println("Prime");
                }
            }
        }
    }
    
}
