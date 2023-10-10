import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
		List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
		List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
		
		List<Integer> students = new ArrayList<>();
		students.add(0);
		for(int i = 1; i<= n; i++) {
			int cnt = 0;
			if(lostList.contains(i)) {
				cnt -=  1;
			} 
            if(reserveList.contains(i)) {
				cnt += 1;
			}
			students.add(cnt);
		}
		
		for(int i=1; i<n; i++) {
			if (students.get(i) == -1) {
				if (students.get(i-1) == 1) {
					students.set(i, 0);
					students.set(i-1, 0);
				} else if (students.get(i+1) == 1) {
					students.set(i, 0);
					students.set(i+1, 0);
				}
			}
		}
		if (students.get(n)==-1 && students.get(n-1)==1) {
			students.set(n, 0);
			students.set(n-1, 0);
		}
		
        answer = n-Collections.frequency(students, -1);
        return answer;
    }
}