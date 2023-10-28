import java.util.*;

class Solution {
    static Map<Character, Integer> score = new HashMap<>();
    
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] type = {'R','T','C','F','J','M','A','N'};
        for(char t : type) {
        	score.put(t, 0);
        }
        
        String svyString = "";
        for(int i=0; i<survey.length; i++) {
        	svyString = survey[i];
        	calScore(svyString.charAt(0), svyString.charAt(1), choices[i]);
        }
        
        sb.append(score.get('T') > score.get('R')?'T':'R');
        sb.append(score.get('F') > score.get('C')?'F':'C');
        sb.append(score.get('M') > score.get('J')?'M':'J');
        sb.append(score.get('N') > score.get('A')?'N':'A');
        
        answer = sb.toString();
         
        return answer;
    }
    
    public void calScore(char left, char right, int choice) {
		if(choice > 4) {
			score.put(right, score.get(right) + (choice-4));
		}else if(choice < 4) {
			score.put(left, score.get(left) + (4-choice));		
		}
	}
}