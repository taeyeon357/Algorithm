import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        int[] top = new int[k];
        for(int i=0; i<k; i++) {
        	top[i] = Integer.MAX_VALUE;
        }
        
        top[0] = score[0];
        answer[0] = score[0];
        int idx = 1;
        
        for(int i=1; i<score.length; i++) {
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