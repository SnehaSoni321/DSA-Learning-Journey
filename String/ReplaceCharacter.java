public class ReplaceCharacter {

    // Replace the old character to new character in the string

    static String replaceChar(String str, int index, char newChar) {
        String result = "";

        if(index < 0 || index >= str.length()){
            return "invali indes: ";
        }

        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(i == index) {
                result = result + newChar;
            } else {
                result = result + ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = StringUtility.inputString();

    
        int index = StringUtility.inputInt();
    
        char newChar = StringUtility.inputCharacter();

        String result =  replaceChar(str, index, newChar);
        System.out.println("New String is: " + result);

    }
    
}
