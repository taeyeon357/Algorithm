import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

        int maxVal;
		for(int test_case = 1; test_case <= T; test_case++)
		{
            maxVal = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
            	int num = Integer.parseInt(st.nextToken());
                if(num >maxVal) maxVal = num;
            }
            
            System.out.println("#"+test_case+" "+maxVal);
			
		}
	}
}