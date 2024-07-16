import java.util.*;

class Solution {
    public int[] solution(int[] arr) {        
        int p = 0;
        while(true){
            if(Math.pow(2,p) >= arr.length) break;
            p++;
        }
        int size = (int)Math.pow(2,p);
        int[] ans = new int[size];
        ans = Arrays.copyOfRange(arr, 0, size);

        return ans;
    }
}