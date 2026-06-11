public class CountLowerCase {

    static int countlowercase(String s) {
        int count = 0;
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>= 'a' && ch<= 'z') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String string = StringUtility.inputString();
        int result = countlowercase(string);

        System.out.println("LowerCsar: " + result);
    }
    
}
