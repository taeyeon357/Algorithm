import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        int len;
        for(String s : strArr){
            len = s.length();
            hm.put(len, hm.getOrDefault(len, 0)+1);
        }
        
        int max = 0;
        for(int l : hm.values()){
            if(l > max) max = l;
        }
        return max;
    }
}