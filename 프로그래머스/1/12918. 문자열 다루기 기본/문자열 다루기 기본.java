import java.util.*;

class Solution {
    public static boolean solution(String s) {
        boolean answer = true;
        
        List<Character> number = Arrays.asList('1','2','3','4','5','6','7','8','9','0');
        
        if (s.length()==4 | s.length() == 6) {
        	for(int i=0; i<s.length(); i++) {
        		if(number.contains(s.charAt(i))) {
        			continue;
        		}else {
        			answer = false;
        			break;
        		}
        	}
        } else {
        	answer = false;
        }
        
        
        return answer;
    }
}