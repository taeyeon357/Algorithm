import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] result = myStr.split("[a|b|c]+");
        if(result.length == 0) return new String[]{"EMPTY"};
        else{
            List<String> ans = new ArrayList<>();
            for(String s : result){
                if(s.length() > 0) ans.add(s);
            }
            
            return ans.toArray(new String[ans.size()]);
        }
    }
}