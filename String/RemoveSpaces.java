public class RemoveSpaces {
    static String removeSpaces(String s) {
        String result = "";
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch != ' ') {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = StringUtility.inputString();

        String ans = removeSpaces(str);
        System.out.println(ans);
    }
    
}
