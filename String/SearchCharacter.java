public class SearchCharacter {

        static boolean searchCharacter(String s, char target) {
            for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == target) {
                return true;
            }
      }
            return false;
        }

    public static void main(String[] args) {

        String str = StringUtility.inputString();

        char target = StringUtility.inputCharacter();

        boolean res = searchCharacter(str, target);

        if(res) {
            System.out.println("Character found: " + target);
        } else {
            System.out.println("Character not found: " + target);
        }




    }
    
}
