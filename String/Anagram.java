public class Anagram {

    /*
     * Given two non-empty strings s1 and s2, consisting only of lowercase English
     * letters, determine whether they are anagrams of each other or not.
     * Two strings are considered anagrams if they contain the same characters with
     * exactly the same frequencies, regardless of their order.
     * 
     */
    static boolean anagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                char ch2 = s2.charAt(j);
                if (ch1 == ch2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = StringUtility.inputString();
        String s2 = StringUtility.inputString();
        

        boolean digit = anagrams(s1, s2);
        System.out.println(digit);

    }

}
