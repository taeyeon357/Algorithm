import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        int val;
        for(String str : intStrs){
            val = Integer.parseInt(str.substring(s, s+l));
            if(val > k) list.add(val);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}