import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
		Map<Integer, Integer> hm = new HashMap<>();
		for(int t : tangerine) {
			if(hm.keySet().contains(t)) {
				hm.put(t, hm.get(t) + 1);
			}else {
				hm.put(t, 1);
			}
		}
		
		List<Integer> valList = new ArrayList<>(hm.values());
		valList.sort(Collections.reverseOrder());
		for(int v : valList) {
			k -= v;
			answer += 1;
			if(k <= 0) {
				break;
			}
		}
		
	    return answer;
    }
}