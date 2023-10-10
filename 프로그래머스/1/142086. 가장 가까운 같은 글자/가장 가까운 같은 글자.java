import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
        	if(hm.keySet().contains(s.charAt(i)+"")) {
        		answer[i] = i - hm.get(s.charAt(i)+"");
        	}else {
        		answer[i] = -1;
        	}
        	hm.put(s.charAt(i)+"", i);
        }
        return answer;
    }
}