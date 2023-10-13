import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++) {
        	for(int j=i+1; j<nums.length-1; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			list.add(nums[i]+nums[j]+nums[k]);
        		}
        	}
        }
        int cnt = 0;
        int check = 0;
        for(int i=0; i<list.size(); i++) {
        	for(int j=2; j<list.get(i); j++) {
        		if(list.get(i)%j==0) {
        			check = 1;
        		}
        	}
        	if(check==0) {
        		answer += 1;
        	}
        	check = 0;
        }
        return answer;
    }
}