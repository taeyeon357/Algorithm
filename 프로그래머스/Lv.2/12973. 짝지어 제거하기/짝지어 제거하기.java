import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;

        Stack<Character> stk = new Stack<>();
        int idx = 0;
        while(true) {
        	if(idx == s.length()) break;
        	
        	stk.add(s.charAt(idx++));
        	
        	if(stk.size() > 1) {
	    		char top = stk.pop();
	    		if(stk.peek() == top) {
	    			stk.pop();
	    		}else {
	    			stk.add(top);
	    		}
        	}
        }
        
        if(stk.size()==0) answer = 1;
        
        return answer;
    }
}