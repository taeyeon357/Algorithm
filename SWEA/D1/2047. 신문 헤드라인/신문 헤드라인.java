import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()){
        	if(Character.isAlphabetic(c)){
            	sb.append(Character.toUpperCase(c));
            }else{
            	sb.append(c);
            }
        }
	
        System.out.println(sb);
		
	}
}