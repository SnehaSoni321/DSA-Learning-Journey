package Level1;

import java.util.*;

public class TakeInput{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        //1. take input for integer

        // int n = scn.nextInt();
        // for(int i = 0; i<=n; i++){
        //     System.out.println(i);
        // }

        //2. take input for string

        // String name = scn.nextLine();
        // System.out.println("Hello" + name);

        //3. take input both integer and string

        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();

        System.out.println("Dear " + name + ". Here is the counting");
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }


    }
}
