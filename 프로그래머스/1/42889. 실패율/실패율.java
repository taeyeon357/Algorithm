import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
       int[] answer = new int[N];
       
       int[][] info = new int[N+1][2]; //스테이지별 도달 인원과 못깬 인원 저장할 배열
       double[][] failure = new double[N][2]; //스테이지와 그 스테이지의 실패율 저장
       for(int i=0; i<stages.length; i++) {
          int stageIdx = stages[i]-1;
          info[stageIdx][0] += 1; // 도달 but 못깸 + 1
       }
       info[0][1] = stages.length; //1단계는 모든 사람이 도달은 함
       for(int i=1; i<info.length; i++) {
          info[i][1] = info[i-1][1] - info[i-1][0];
       }
       
       for (int i = 0; i < failure.length; i++) {
			failure[i][0] = i;
			if (info[i][1] == 0) {
				failure[i][1] = 0;
			} else {
				failure[i][1] = (double) info[i][0] / info[i][1];
			}
		}

       Arrays.sort(failure,(o1, o2) -> {
    	   if(o1[1]==o2[1]) {
    		   return Double.compare(o1[0], o2[0]);
    	   }else {
    		   return Double.compare(o2[1], o1[1]);
    	   }
       });
       for(int i=0; i<N; i++) {
    	   answer[i] = (int)failure[i][0] + 1;
       }
        return answer;
    }
}