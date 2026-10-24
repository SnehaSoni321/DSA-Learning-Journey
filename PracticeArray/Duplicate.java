
import java.util.Scanner;

public class Duplicate {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
    boolean[] visited = new boolean[n];

    for(int i = 0; i<n; i++){
      if(visited[i]) {
        continue;
      }
    int count = 1;

    for(int j = i+1; j<n; j++){
      if(arr[i] == arr[j]){
        count++;
        visited[j] = true;
      }
    }
      if(count > 1) {
        System.out.println("The duplicate: " + arr[i]);
      }
    }
  }
}
