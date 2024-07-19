import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        StringBuilder sb = new StringBuilder();
        List<String> answer = new ArrayList<>();
        
        for(String p : picture){
            for(char c : p.toCharArray()){
                sb.append((""+c).repeat(k));
            }
            for(int i=0; i<k; i++){
                answer.add(sb.toString());
            }
            sb.setLength(0);
        }
        return answer.toArray(new String[answer.size()]);
    }
}