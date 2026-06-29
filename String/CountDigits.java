public class CountDigits {

    /*count only Digits   */
    static int countDigits(String s) {
        int count = 0;
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str = StringUtility.inputString();
        int result = countDigits(str);
        System.out.println("Digits: "+ result);

        
    }
    
}
