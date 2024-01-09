import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<commands.length; i++) {
        	for(int j=commands[i][0]-1; j<commands[i][1]; j++) {
        		list.add(array[j]);
        	}
        	Collections.sort(list);
        	answerList.add(list.get(commands[i][2]-1));
        	list.clear();
        }
        
        answer = answerList.stream().mapToInt(a->a).toArray();
        return answer;
    }
}