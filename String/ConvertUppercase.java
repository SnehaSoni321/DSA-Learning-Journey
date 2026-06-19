public class ConvertUppercase {

    static String convertUppercase(String s) {

        String result = "";

    for(int i = 0; i<s.length(); i++) {
        char ch = s.charAt(i);

        if(ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 32);
        }
        result = result + ch;
     }
       return result;
    }
    
    

    public static void main(String[] args) {
      
        String str = StringUtility.inputString();

        String ans = convertUppercase(str);
        System.out.println(ans);
        }
    
}
