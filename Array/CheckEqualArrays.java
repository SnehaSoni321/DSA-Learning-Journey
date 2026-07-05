package Array;

public class CheckEqualArrays {

    /*
     * Given two arrays a[] and b[] of equal size, the task is to find whether the
     * elements in the arrays are equal.
     * Two arrays are said to be equal if both contain the same set of elements,
     * arrangements (or permutations) of elements may be different though.
     * Note: If there are repetitions, then counts of repeated elements must also be
     * the same for two arrays to be equal.
     */

    static boolean checkEqual(int[] a, int[] b) {
        if (a.length == b.length) {
            return true;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = ArrayUtility.inputArray();
        int b[] = ArrayUtility.inputArray();
        boolean result = checkEqual(a, b);
        System.out.println(result);

    }

}