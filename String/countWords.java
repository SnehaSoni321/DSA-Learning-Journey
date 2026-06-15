public class countWords {

    static int countWords(String str) {
        int count = 1;

        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == ' ') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = StringUtility.inputString();

        int result = countWords(str);
        System.out.println("Total words: " + result);
    }
    
}
