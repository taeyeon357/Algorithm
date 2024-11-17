import java.util.*;
import java.io.*;

class Solution
{
    static int maximum;
    static int[] tasty;
    static int[] cal;
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
            
            tasty = new int[N];
            cal = new int[N];
            maximum = Integer.MIN_VALUE;
            for(int i=0; i<N; i++){
            	StringTokenizer st2 = new StringTokenizer(br.readLine());
                tasty[i] = Integer.parseInt(st2.nextToken());
                cal[i] = Integer.parseInt(st2.nextToken());
            }
            dfs(0, N, L, 0, 0);
            System.out.println("#"+test_case+" "+maximum);
		}
	}
    
    public static void dfs(int i, int N, int L, int tSum, int cSum){
    	if(cSum > L) return;
        if(i==N){
        	if(maximum < tSum) maximum = tSum;
        }else{
        	dfs(i+1, N, L, tSum+tasty[i], cSum+cal[i]);
            dfs(i+1, N, L, tSum, cSum);
        }
    }
}