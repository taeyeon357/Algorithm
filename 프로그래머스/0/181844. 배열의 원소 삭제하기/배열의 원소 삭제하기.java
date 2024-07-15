import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> ans = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int d : delete_list){
            ans.remove(Integer.valueOf(d));
        }
        return ans.stream().mapToInt(i->i).toArray();
    }
}