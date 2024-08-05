import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville) pq.offer(s);
        int cnt = 0;
        while(true){
            if(pq.isEmpty()){
                cnt = -1;
                break;
            }
            int a = pq.poll();
            if(a < K){
                if(pq.isEmpty()){
                    cnt = -1;
                    break;
                }
                pq.offer(a+(pq.poll()*2));
            }else{
                break;
            }
            cnt++;
        }
        return cnt;
    }
}