class Solution {
    public int solution(int n) {
        int answer = 0;
        int cntN = countOne(n);
        
        n++;
        while(true) {
        	if(countOne(n) == cntN) break;
        	n++;
        }
        answer = n;
        return answer;
    }
	
	public int countOne(int n) {
		String binary = Integer.toBinaryString(n);
		int cnt = 0;
		for(int i=0; i<binary.length(); i++) {
			if(binary.charAt(i)=='1') cnt += 1;
		}
		
		return cnt;
	}
}