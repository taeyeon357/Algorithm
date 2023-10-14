class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int cnt = 0;
        int removedZeros = 0;
        int c = 0;//0 제거된 길이
        while(!s.equals("1")) {
        	c = 0;
        	for(int i=0; i<s.length(); i++) {
        		if(s.charAt(i)=='1') c += 1;
        	}
        	removedZeros += (s.length() - c);
        	s = Integer.toBinaryString(c);
        	cnt += 1;
        }
        answer[0] = cnt;
        answer[1] = removedZeros;
        return answer;
    }
}