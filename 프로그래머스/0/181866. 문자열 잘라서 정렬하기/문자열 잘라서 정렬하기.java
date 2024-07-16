import java.util.*;

class Solution {
    public String[] solution(String myString) {
        if(myString.startsWith("x")) myString = myString.substring(1);
        if(myString.endsWith("x")) myString = myString.substring(0, myString.length());
        
        String[] answer = myString.split("[x]+");
        Arrays.sort(answer);
        return answer;
        
        //return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
    
    }
}