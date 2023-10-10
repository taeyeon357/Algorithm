import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<numbers.length; i++) {
        	for(int j=0; j<numbers.length; j++) {
        		if(i!=j) {
        			hs.add(numbers[i] + numbers[j]);
        		}
        	}
        }
        answer = hs.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}