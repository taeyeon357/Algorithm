import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] ans = new int[num_list.length - 5];
        for(int i=0; i<ans.length; i++){
            ans[i] = num_list[i+5];
        }
        return ans;
    }
}