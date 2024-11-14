import java.util.*;
import java.io.*;


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
            if(a == b) System.out.println("#"+test_case+" "+"=");
            else if(a > b) System.out.println("#"+test_case+" "+">");
            else System.out.println("#"+test_case+" "+"<");
		}
	}
}