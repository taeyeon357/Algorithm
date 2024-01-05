import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> pSet = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
        	pSet.add(nums[i]);
        }
        
        if(pSet.size() >= (nums.length/2)) {
        	answer = nums.length/2;
        }else {
        	answer = pSet.size();
        }
    
        return answer;
    }
}