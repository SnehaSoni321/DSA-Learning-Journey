public class CountSpaces {

    static int countspaces(String s) {
        int count = 0;

        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == ' ') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        String string = StringUtility.inputString();

        int result = countspaces(string);
        System.out.println("Spaces: " + result);

    }
    
}
