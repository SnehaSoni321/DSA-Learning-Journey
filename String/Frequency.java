public class Frequency {
    // take String and target Character and count the target Character in the string
    
    static int frequency(String str, char target) {
        int count = 0;

        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = StringUtility.inputString();
        char target = StringUtility.inputCharacter();

        int result = frequency(str, target);
        System.out.println("Frequency: " + result);
    }
}
