package Array;

public class Reverse {

    /*only Reverse Array print*/

    static void ReverseArray(int arr[]) {
        for(int i = arr.length-1; i>=0; i--) { 
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        
        int arr[] = ArrayUtility.inputArray();

         ReverseArray(arr);
    }
}
