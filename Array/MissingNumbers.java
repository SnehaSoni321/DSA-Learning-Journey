
package Array;
public class MissingNumbers {

    /* finding all missing numbers */

    static void findAllMissingNumber(int arr[]) {
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }else if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Missing number: ");

        for(int num = min; num <= max; num++) {
            boolean found = false;

            for(int i = 0; i<arr.length; i++) {
                if(arr[i] == num) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = ArrayUtility.inputArray();

        findAllMissingNumber(arr);

    }
    
}
