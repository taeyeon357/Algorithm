import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		int[] arr = new int[n];
		
		for (int i =0; i<n; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(arr);
		
		for (int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

}