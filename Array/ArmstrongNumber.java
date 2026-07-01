package Array;
public class ArmstrongNumber {

    /*
    abc = a3 + b3 + c3 -> (153 = 1^3 + 5^3 + 3^3)
    
    */
    static boolean armstrongNumber(int n) {
        int originalNum = n;
        int sum = 0;
        while(n!=0) {
            int digit = n%10;
            int cubeOfDigits = digit*digit*digit;
            sum = sum+cubeOfDigits;

            n=n/10;
        }
        if(sum == originalNum) {
            System.out.println("Yes, this is armstrong Number");
            return true;

        } else{
            System.out.println("NO, this is not a armstrong Number");
            return false;
        }
    }
public static void main(String[] args) {
    int n = ArrayUtility.inputValue(0);
    armstrongNumber(n);
}

    
}
