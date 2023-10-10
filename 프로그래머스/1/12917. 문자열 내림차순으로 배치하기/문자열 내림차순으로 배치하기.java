import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<String> upper = new ArrayList<>();
        List<String> lower = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++) {
        	if((int)'z' <= (int)(s.charAt(i))) {
        		lower.add(Character.toString(s.charAt(i)));
        	}else {
        		upper.add(Character.toString(s.charAt(i)));
        	}
        }
        upper.sort(Collections.reverseOrder());
        lower.sort(Collections.reverseOrder());
        
        answer = String.join("", lower) + String.join("", upper);
        return answer;
    }
}