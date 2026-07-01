public class LastDigitOfANumber {

    static int lastDigit(String str) {

        int n = Integer.parseInt(str);
        return n % 10;
    } /*
       * String me likhe hue number ko actual
       * integer (int) me convert karna h
       * 
       * -> Integer.parseInt(str) Java ka predefined method h or Integer Java ki
       * predefined wrapper class h
       * 
       * Wrapper Class - ek predefined class hoti h jo primitive data type ko object
       * me convert karti h
       * 
       */

    public static void main(String[] args) {
        String str = StringUtility.inputString();
        int digit = lastDigit(str);
        System.out.println(digit);
    }

}
