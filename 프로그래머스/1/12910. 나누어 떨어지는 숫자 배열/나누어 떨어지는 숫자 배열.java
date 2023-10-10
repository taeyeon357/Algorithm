import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        List<Integer> answerList = new ArrayList<>();
		
		for(int a : arr) {
			if(a%divisor==0) {
				answerList.add(a);
			}
		}
		if(answerList.size() == 0) {
			answerList.add(-1);
			answer = answerList.stream().mapToInt(a->a).toArray();
		}else{
            answer = answerList.stream().mapToInt(a->a).toArray();
            Arrays.sort(answer);
        }
        
        return answer;
    }
}