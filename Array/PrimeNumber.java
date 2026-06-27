package Array;

public class PrimeNumber {

    // check the number is prime or not

    static boolean primeNumber(int num) {
        if(num <= 1) {
            return false;
        }

        for(int i = 2; i<num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {

        int num = ArrayUtility.inputValue(0);
        primeNumber(num);

         if(primeNumber(num)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
        
    }


    
}
