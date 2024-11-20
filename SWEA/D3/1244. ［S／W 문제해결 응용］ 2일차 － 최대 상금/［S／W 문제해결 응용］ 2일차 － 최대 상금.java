import java.util.*;
import java.io.*;

class Solution
{
	static int maxVal;
	public static void main(String args[]) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		String num;
		int n;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			num = st.nextToken();
			n = Integer.parseInt(st.nextToken());

            maxVal = 0;
			swap(0, 0, n, num.toCharArray());
			System.out.println("#"+test_case+" "+maxVal);
		}
	}

	public static void swap(int idx, int L, int n, char[] arr){
		if(L>n) return;
		if(L==n){
			int tmp = Integer.parseInt(new String(arr));
			if(maxVal <= tmp){
				maxVal = tmp;
			}
			return;
		}else{
			for(int i=idx; i<arr.length; i++){
				for(int j=i+1; j<arr.length; j++){
					char c = arr[j];
					arr[j] = arr[i];
					arr[i] = c;
					swap(i, L+1, n, arr);
					c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
			}
			return;
		}
	}
}