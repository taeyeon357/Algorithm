import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        HashSet<Integer> hs = new HashSet<>();
		for (int num = 1; num <= number; num++) {
			for (int i = 1; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					hs.add(i);
					hs.add(num / i);
				}
			}
			if(hs.size() > limit) answer += power;
			else answer += hs.size();
            
            hs = new HashSet<>();
		}
        return answer;
    }
}