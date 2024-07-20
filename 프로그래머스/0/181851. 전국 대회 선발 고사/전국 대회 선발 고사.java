import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->rank[a] - rank[b]);
        for(int i=0; i<rank.length; i++){
            if(attendance[i])
                queue.add(i);
        }
        
        return queue.poll() * 10000 + queue.poll() * 100 + queue.poll();
    }
}