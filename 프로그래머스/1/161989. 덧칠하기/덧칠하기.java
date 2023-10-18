class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int idx = 1;
		while (idx <= n) {
			for(int s : section) {
				if(idx > s) continue;
				else {
					idx = s + m;
					answer += 1;
				}
			}
            break;
		}
        
        return answer;
    }
}