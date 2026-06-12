package Array;

public class SumOfElements {

    static int SumOfAllArrayElement(int arr[]) {

        int x = arr[0];
        for(int i = 1; i<arr.length; i++) {
            x = x+arr[i];
        }
        return x;
    }

    public static void main(String[] args) {

        int arr[] = ArrayUtility.inputArray();

        int result = SumOfAllArrayElement(arr);
        System.out.println("Sum of All Array Element: "+ result );
        
    }
    
}
