class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int cnt = 0;
        for(int i=0; i<s.length(); i++) {
        	if(" ".equals(Character.toString(s.charAt(i)))) {
        		cnt = 0;
        		sb.append(" ");
        	}else {
        		if(cnt % 2 == 0) {
        			sb.append(Character.toUpperCase(s.charAt(i)));
        		}else {
        			sb.append(Character.toLowerCase(s.charAt(i)));
        		}
        		cnt += 1;
        	}
        }
        
        answer = sb.toString();
        
        return answer;
    }
}