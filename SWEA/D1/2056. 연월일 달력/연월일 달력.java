import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        String year;
        int month, day;
        String ans;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			ans = "";
            String str = br.readLine();
            year = str.substring(0,4);
            month = Integer.parseInt(str.substring(4,6));
            day = Integer.parseInt(str.substring(6,8));
            
            // 1 3 5 7 8 10 12 -> 31
            // 4 6 9 11 -> 30
            // 2 -> 28
            if(month >= 1 && month <= 12){
                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                	if(day > 31){
                    	ans = "-1";
                    }
                }else if(month == 2 ){
                	if(day > 28) ans = "-1";
                }else if(day > 30){
                	ans = "-1";
                }
            }else{
                ans = "-1";
            }
            if(!ans.equals("-1")){
            	ans += (String.valueOf(year) + "/");
                if(month < 10){
                	ans += ("0"+String.valueOf(month)+"/");
                }else{
                	ans += (month + "/");
                }
                
                if(day<10){
                    ans += ("0"+String.valueOf(day));
                }else{
                	ans += String.valueOf(day);
                }
            }
               
            System.out.println("#"+test_case+" "+ans);
        }
	}
}