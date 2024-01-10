import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        //오름차순 정렬
        Arrays.sort(citations);
        int start = 0;
        for(int i=0; i<citations[citations.length-1]; i++) {
        	for(int j=start; j<citations.length; j++) {
        		if(i <= citations[j]) {
        			start = j;
        			if(citations.length - j >= i && answer <= i) {
        				answer = i;
        			}
        			break;
        		}
        	}
        }
        
        return answer;
    }
}