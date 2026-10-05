package Level1;
import java.util.Scanner;

public class RotateANumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int n = sc.nextInt();
        System.out.println("Enter rotation no. ");
        int k = sc.nextInt();

        int temp = n;
        int nod = 0;
        while(temp > 0){
            temp = temp / 10;
            nod++;
        }

        // when k is big then enter digits no.
        k = k % nod;
        // when k is negative
        if(k < 0){
            k = k + nod;
        }

        int div = 1;
        int mult = 1;
        for(int i = 1; i<=nod; i++){
            if(i <= k){
                div = div * 10;
            }else{
                mult = mult * 10;
            }
        }

        int q = n/div;
        int r = n % div;

        int rot = r * mult + q;
        System.out.println(rot);
    }
}