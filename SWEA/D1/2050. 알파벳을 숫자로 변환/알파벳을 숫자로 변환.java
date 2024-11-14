import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		String str = br.readLine();
        for(char c : str.toCharArray()){
        	sb.append(Character.toUpperCase(c) - 'A' + 1).append(" ");
        }
        System.out.println(sb.toString().trim());
	}
}