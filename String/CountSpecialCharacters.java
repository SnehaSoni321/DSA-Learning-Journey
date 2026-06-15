public class CountSpecialCharacters {

    static int countspacialcharacters(String str) {
        
    int count = 0;
    for(int i = 0; i<str.length(); i++) {
        char ch = str.charAt(i);

        if(!(ch >= 'A' && ch <= 'Z') &&
            !(ch >= 'a' && ch <= 'z') &&
            !(ch >= '0' && ch <= '9') &&
            ch != ' ') {
                count++;
            }
    }
    return count;
}

    public static void main(String[] args) {
        String str = StringUtility.inputString();

        int result = countspacialcharacters(str);

        System.out.println("Spacial characters is: "+ result);
    }
}
