import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> result = new ArrayList<>();
        
        result.add(arr[0]);
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
        	if(result.get(idx).equals(arr[i])) {
        		continue;
        	}else {
        		result.add(arr[i]);
        		idx += 1;
        	}
        }
        answer = result.stream().mapToInt(a->a).toArray();

        return answer;
    }
}