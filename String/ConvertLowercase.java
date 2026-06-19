public class ConvertLowercase {

     static String convertLowercase(String s) {

        String result = "";

    for(int i = 0; i<s.length(); i++) {
        char ch = s.charAt(i);

        if(ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        result = result + ch;
     }
       return result;
    }

    public static void main(String[] args) {

    String str = StringUtility.inputString();

    String ans = convertLowercase(str);
    System.out.println(ans);
        
    }
    
}
