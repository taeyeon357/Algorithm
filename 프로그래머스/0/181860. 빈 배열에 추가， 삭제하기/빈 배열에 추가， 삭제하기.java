import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        String str = "";
        
        for(int i=0; i<flag.length; i++){
            if(flag[i]){
                str += (""+arr[i]).repeat(arr[i]*2);
            }    
            else{
                str = str.substring(0, str.length() - arr[i]);
            }
        }

        String[] strArr = str.split("");
        int[] ans = new int[strArr.length];
        for(int i=0; i<ans.length; i++){
            ans[i] = Integer.parseInt(strArr[i]);
        }
        
        return ans;
            
    }
}