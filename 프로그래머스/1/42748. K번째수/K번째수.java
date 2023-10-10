import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
                List<Integer> aList = new ArrayList<>();
        
        
        for(int i=0; i<commands.length; i++) {
        	List<Integer> list = new ArrayList<>();
        	for(int j=commands[i][0]-1; j<=commands[i][1]-1; j++) {
        		list.add(array[j]);
        	}
        	Collections.sort(list); //오름차순 정렬
        	aList.add(list.get(commands[i][2]-1));
        }
        
        answer = aList.stream().mapToInt(a->a).toArray();
        return answer;
    }
}