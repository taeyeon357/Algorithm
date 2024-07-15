import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x");
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<strArr.length; i++){
            ans.add(strArr[i].length());
        }
        
        if(myString.charAt(myString.length()-1) == 'x') ans.add(0);
        
        return ans.stream().mapToInt(i->i).toArray();
    }
}