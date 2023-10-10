class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
        	char c = s.charAt(i);
        	if(" ".equals(Character.toString(s.charAt(i)))) {
        		sb.append(" ");
        	}
        	else if((int)c < (int)'a') { //대문자라면
        		if((int)c + n > (int)'Z') {
        			sb.append((char)((int)'A' + ((int)c + n) % ((int)'Z'+ 1) ));
        		}else {        			
        			sb.append((char)((int)c + n));
        		}
        	} else { //소문자라면
        		if((int)c + n > (int)'z') {
        			sb.append((char)((int)'a' + ((int)c + n) % ((int)'z'+ 1) ));
        		}else {        			
        			sb.append((char)((int)c + n));
        		}
        	}
        }
        
        answer = sb.toString();
        
        return answer;
    }
}