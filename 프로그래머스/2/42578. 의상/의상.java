import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
       int answer = 1;
		Map<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < clothes.length; i++) {
			if (hm.keySet().contains(clothes[i][1])) {
				hm.put(clothes[i][1], hm.get(clothes[i][1]) + 1);
			} else {
				hm.put(clothes[i][1], 1);
			}
		}

		//a가지 b가지 c가지 -> (a+1)(b+1)(c+1)-1 = abc + ab + bc + ac + a + b + c + 1 -1
		List<Integer> list = new ArrayList<>(hm.values());
		for(int i=0; i<list.size(); i++) {
			answer *= (list.get(i)+1);
		}
		return answer-1; 
    }
}