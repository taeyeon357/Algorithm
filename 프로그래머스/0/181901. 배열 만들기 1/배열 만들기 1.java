import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        
        int mul = k;
        while(mul <= n){
            list.add(mul);
            mul += k;
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}