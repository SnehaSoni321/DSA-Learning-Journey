public class LastCharacter {

    /*  */
    static char LastCharacter(String s) {
        return s.charAt(s.length() - 1);
    }

    public static void main(String[] args) {
        String str = StringUtility.inputString();
        char result = LastCharacter(str);
        System.out.println("Last Character is: "+ result);

    }
    
}
