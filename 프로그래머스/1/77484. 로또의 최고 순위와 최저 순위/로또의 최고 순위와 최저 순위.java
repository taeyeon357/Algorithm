import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        List<Integer> winList = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        int zeroCnt = 0;
        int winCnt = 0;
        for(int i=0; i<lottos.length; i++) {
        	if(lottos[i] == 0) {
        		zeroCnt += 1;
        	}else if(winList.contains(lottos[i])) {
        		winCnt += 1;
        	}
        }
        
        int high = (winCnt + zeroCnt)>=2?7-(winCnt + zeroCnt):6;
        int low = winCnt>=2?7-winCnt:6;
        
        answer[0] = high;
        answer[1] = low;
        return answer;
    }
}