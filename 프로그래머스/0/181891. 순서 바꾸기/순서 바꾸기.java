import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[num_list.length];
        int idx = 0;
        for(int i=n; i<num_list.length; i++){
            result[idx++] = num_list[i];
        }
        for(int i=0; i<n; i++){
            result[idx++] = num_list[i];
        }
        
        return result;
    }
}