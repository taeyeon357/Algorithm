import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> bList = Arrays.asList(babbling);
        
        String reg = "(aya|ye|woo|ma)+";
        String cant = "(aya|ye|woo|ma)*(ayaaya|yeye|woowoo|mama)+(aya|ye|woo|ma)*";
        for(String b : babbling) {
        	if(Pattern.matches(reg, b)&&!Pattern.matches(cant,b)){
        		answer += 1;
        	}
        		
        }
        return answer;
    }
}