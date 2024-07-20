import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                map.put(rank[i], i);
            }
        }
        
        List<Integer> key = new ArrayList<>(map.keySet());
        Collections.sort(key);
        sum += (map.get(key.get(0))*10000);
        sum += (map.get(key.get(1))*100);
        sum += (map.get(key.get(2)));        
        return sum;
    }
}