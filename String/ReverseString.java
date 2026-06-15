public class ReverseString {

       static String reverseString(String s) {
        String rev = ""; 

        for(int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
       }

    public static void main(String[] args) {

        String str = StringUtility.inputString();

        String result = reverseString(str);
       System.out.println("Reverse String: "+ result);
    }
    
}
