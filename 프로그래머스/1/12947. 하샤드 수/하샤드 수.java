class Solution {
    public boolean solution(int x) {
                boolean answer = false;
        
        String xStr = Integer.toString(x);
        int sum = 0;
        for(int i =0; i<xStr.length(); i++) {
        	sum += ((int)(xStr.charAt(i)-(int)'0'));
        }
        
        if(x%sum==0) {
        	answer = true;
        }
        return answer;
    }
}