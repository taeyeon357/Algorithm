import java.util.*;
import java.io.*;

public class Main {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] nk = br.readLine().split(" ");
      String[] nums = br.readLine().split(" ");

      int n = Integer.parseInt(nk[0]);
      int k = Integer.parseInt(nk[1]);

      int[] arr = new int[n];
      for(int i=0; i<n; i++) arr[i] = Integer.parseInt(nums[i]);

      Arrays.sort(arr);

      System.out.println(arr[k-1]);
   } 
}