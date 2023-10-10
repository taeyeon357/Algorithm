import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        StringBuilder result = new StringBuilder();
        StringBuilder num = new StringBuilder();

        HashMap<String, Integer> table = new HashMap() {{
        	put("zero", 0);
        	put("one", 1);
        	put("two", 2);
        	put("three", 3);
        	put("four", 4);
        	put("five", 5);
        	put("six", 6);
        	put("seven", 7);
        	put("eight", 8);
        	put("nine", 9);
        }};
        
        for(int i=0; i<s.length(); i++) {
        	char c = s.charAt(i);
        	if(c >= '0' && c <= '9') {
        		result.append(c);
        	}else {
        		num.append(c);
        		if(table.keySet().contains(num.toString())) {
        			result.append(table.get(num.toString()));
        			num.setLength(0);
        		}
        	}
        }
        answer = Integer.parseInt(result.toString());
        
        return answer;
    }
}