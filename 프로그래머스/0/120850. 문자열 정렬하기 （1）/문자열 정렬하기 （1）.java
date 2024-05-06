import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        char[] strArr = my_string.toCharArray();
        for(int i=0; i<strArr.length; i++){
            if(strArr[i] >= '0' && strArr[i] <= '9'){
                list.add(strArr[i] - '0');
            }
        }
        
        Collections.sort(list);
        return list.stream().mapToInt(i->i).toArray();
    }
}