package Array;

class CountOddAndEven {

    /*
     *  Given an array arr[] of positive integers. The task is to return the count of
     *   the number of odd and even elements in the array.
     * 
     * Note: Return two elements where the first one in the count of odd & second
     * one is the count of even.
     */
    public static void main(String args[]) {
      int []arr = {2,3,4,5,6};
      int evenCount = 0;
      int oddCount = 0;
      for(int i = 0; i<arr.length; i++) {
        if(arr[i] % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
      }

      // return new int[]{oddCount, evenCount};
      
      System.out.println("odd: "+ oddCount);
      System.out.println("even: "+ evenCount);

    }
}