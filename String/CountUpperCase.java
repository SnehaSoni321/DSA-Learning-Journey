public class CountUpperCase {

    static int countuppercase(String s) {
        int count = 0;
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>= 'A' && ch <= 'Z') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        String string = StringUtility.inputString();

        int result = countuppercase(string);
        System.out.println("Uppercase: " + result);


    }
    
}
