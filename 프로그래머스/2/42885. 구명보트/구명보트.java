import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int[] selected = new int[people.length];
        
        Arrays.sort(people);

        int left = 0;
        int right = people.length-1;
        while(left <= right) {
        	if(people[left] + people[right] <= limit) { // 가장 무거운 사람과 가장 가벼운 사람을 태움
        		answer++;
        		left++;
        		right--;
        	}else {
        		answer++;
        		right--; // 두 명을 태울 수 없다면, 무거운 사람을 태우는 것이 효율적
        	}
        }
        
        return answer;
    }
}