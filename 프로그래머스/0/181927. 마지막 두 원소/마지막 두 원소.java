import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        if(num_list[len-1] > num_list[len-2])  list.add(num_list[len-1] - num_list[len-2]);
        else list.add(num_list[len-1]*2);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}