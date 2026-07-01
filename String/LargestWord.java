public class LargestWord {

    static String largestWord(String s) {

        String word = "";
        String largest = "";

        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch != ' ') {
                word = word + ch;
            } else {
                if(word.length() > largest.length()) {
                    largest = word;
                }
                word = "";
            }
        }

        if(word.length() > largest.length()) {
            largest = word;
        }
        return largest;

    }
    public static void main(String[] args) {
        String s = StringUtility.inputString();
       String result = largestWord(s);
       System.out.println(result);
    }
    
}
