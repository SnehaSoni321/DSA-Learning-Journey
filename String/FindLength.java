public class FindLength {

    /* find length without length() */
    static int findLength(char arr[]) {
        int count = 0;

        for(int i = 0; i<arr.length; i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        
        char arr[] = {'s','n','e','h','a'};

        System.out.println(findLength(arr));
    }
    
}
