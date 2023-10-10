import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        List<String> alphabet = Arrays.asList(
        		"a","b","c","d",
        		"e","f","g","h",
        		"i","j","k","l",
        		"m","n","o","p",
        		"q","r","s","t",
        		"u","v","w","x",
        		"y","z"
        		);
        
        List<String> skipList = Arrays.asList(skip.split(""));
        List<String> removedList = new ArrayList<>();
        
        for(String al : alphabet) {
        	if(skipList.contains(al)) {
        		continue;
        	}else {
        		removedList.add(al);
        	}
        }
        
         for(int i=0; i<s.length(); i++) {
        	int a = (removedList.indexOf(Character.toString(s.charAt(i))) + index)%removedList.size();
        	answer += removedList.get(a);
        }
        
        
        return answer;
    }
}