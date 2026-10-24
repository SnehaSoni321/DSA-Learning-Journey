package Level1Function;

import java.util.Scanner;

public class FunctionEx {

  public static int fact(int x){
    int rv = 1;
    for(int i = 1; i<=x; i++){
      rv = rv * i;
    }
    return rv;
  }
  public static void main(String[] args) {
    // Find npr   = n!/(n-r)!
    Scanner sc = new Scanner(System.in);
    System.out.println("finding npr");
    System.out.println("Enter n");
    int n = sc.nextInt();
    System.out.println("Enter r");
    int r = sc.nextInt();


    // ye code correct h per yaha n or n-r ka code repeat kar rahe h jo ki ek achi baat nhi h coding have h rule DRY(Do not repeat yourself) kyuki maintenance ki problem aa sakti h isiliye hum function ka use karte h  

    // // n ka factorial 
    // int nfact = 1;
    // for(int i = 1; i<=n; i++){
    //   nfact *= i;
    // }
    // // n - r ka factorial
    // int nmrfact = 1;
    // for(int i = 1; i<=n-r; i++){
    //   nmrfact *= i;
    // }

    // int npr = nfact/nmrfact;
    // System.out.println(n + "p" + r + " = " + npr);

  
    int nfact = fact(n);
    int nmrfact = fact(n-r);

    int npr = nfact/nmrfact;
    System.out.println(n + "p" + r + " = " + npr);



  }
  
}
