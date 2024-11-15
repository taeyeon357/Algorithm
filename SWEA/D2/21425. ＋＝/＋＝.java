import java.util.*;
import java.io.*;
import java.math.*;


class Solution
{
	public static void main(String args[]) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            
           	int cnt = 0;
            while(a <= n && b<= n){
            	if(a>b){
                	b += a;
                }else{
                	a += b;
                }
                cnt++;
            }
            System.out.println(cnt);
        }
	}
}