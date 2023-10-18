import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> sList = IntStream.of(score).boxed().collect(Collectors.toList());
		Collections.sort(sList, Collections.reverseOrder());
		for(int i=m-1; i<sList.size(); i+=m) {
			answer += (sList.get(i)*m);
		}
        return answer;
    }
}