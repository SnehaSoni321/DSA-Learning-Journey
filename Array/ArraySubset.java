package Array;

public class ArraySubset {

    /*
    Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].
    */
  
    /*  note -> subset = b ke jitne bhi elements h, wo sab a ke andar hone chahiye. */

    static boolean arraySubset(int a[], int b[]) {
         // Your code here
        for(int i = 0; i<a.length; i++) {
            for(int j = 0; j<b.length; j++) {
                if(a[i] == b[j]){
                    return true;
                }
            }
        }
         return false;
    }
    public static void main(String[] args) {
        int a[] = ArrayUtility.inputArray();
        int b[] = ArrayUtility.inputArray();

        boolean result = arraySubset(a, b);
        System.out.println(result);
        
    }
    
}
