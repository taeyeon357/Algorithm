import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        int[] top = new int[k];
        for(int i=0; i<k; i++) {
        	top[i] = Integer.MAX_VALUE;
        }
        
        int idx = 0;
        
        for(int i=0; i<score.length; i++) {
        	if(idx==k) {
        		if(score[i] > top[0]) {
        			top[0] = score[i];
        		}
        		Arrays.sort(top);
        		answer[i] = top[0];
        	}else {
        		top[idx] = score[i];
        		Arrays.sort(top);
        		answer[i] = top[0];
        		idx += 1;
        	}
        }
        return answer;
    }
}