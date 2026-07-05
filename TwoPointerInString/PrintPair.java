package TwoPointerInString;

public class PrintPair {

    // string ke start aur end ke characters ko pair mei print karna.

    static void reverse(String str) {
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            
            System.out.println(str.charAt(left) + " " + str.charAt(right));

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String str = StringUtility.inputString();
        reverse(str);
    }
    
}
