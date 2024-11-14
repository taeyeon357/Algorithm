import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
        int sum = 0;
        while(num > 0){
        	sum += (num%10);
            num /= 10;
        }
        System.out.println(sum);
	}
}