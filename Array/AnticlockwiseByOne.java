package Array;

public class AnticlockwiseByOne {

    /*
    Given an array arr, rotate the array by one position in Anticlockwise direction.
    */
    static void anticlock(int arr[]) {

    int first = arr[0];

    for(int i = 0; i < arr.length - 1; i++) {
        arr[i] = arr[i + 1];
    }

    arr[arr.length - 1] = first;
}
    public static void main(String[] args) {
         int arr[] = ArrayUtility.inputArray();
        anticlock(arr);

        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
