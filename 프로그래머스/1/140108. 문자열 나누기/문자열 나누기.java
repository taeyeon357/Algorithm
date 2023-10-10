class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
		int xCnt = 1;
		int otherCnt = 0;
		for (int i = 1; i<s.length(); i++) {
			if(xCnt == otherCnt) {
				answer += 1;
				x = s.charAt(i);
				xCnt = 1;
				otherCnt = 0;
			}else if (s.charAt(i)==x) {
				xCnt += 1;
			} else {
				otherCnt += 1;
			}
		}
        return answer+1;
    }
}