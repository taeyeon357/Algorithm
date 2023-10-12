import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0; i<nums.length; i++) {
        	hs.add(nums[i]);
        }
        
        int bringN = nums.length/2;
        int kindsN = hs.size();
        
        if(kindsN >= bringN) {
        	answer = bringN;
        }else {
        	answer = kindsN;
        }
        
        return answer;
    }
}