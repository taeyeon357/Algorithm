class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int cnt = 0;
        if(s.charAt(0) == ')') {
            cnt = -1;
        }else {
            cnt = 1;
        	for(int i=1; i<s.length(); i++) {
        		if(s.charAt(i)=='(') cnt += 1;
        		else cnt -= 1;
        		
        		if(cnt == -1) {
        			break;
        		}
        	}
        }
        if(cnt == 0) {
        	answer = true;
        }else {
        	answer = false;
        }
        return answer;
    }
}