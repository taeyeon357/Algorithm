import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int[] l = new int[sizes.length];
        int[] s = new int[sizes.length];
        
        for(int i=0; i<sizes.length; i++) {
        	if(sizes[i][0]>=sizes[i][1]) {
        		l[i] = sizes[i][0];
        		s[i] = sizes[i][1];
        	} else {
        		l[i] = sizes[i][1];
        		s[i] = sizes[i][0];        		
        	}
        }
        
        Arrays.sort(l);
        Arrays.sort(s);
        
        answer = l[sizes.length-1] * s[sizes.length-1];
        
        return answer;
    }
}