import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        StringBuilder sb = new StringBuilder();
        
        List<String> nums = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        
        boolean first = true;
        for(int i=0; i<sArr.length; i++) {
            if(" ".equals(sArr[i])) {
        		first = true;
        		sb.append(" ");
        		continue;
        	}
        	if(first && !nums.contains(sArr[i])) {
        		sb.append(sArr[i].toUpperCase());
        		first = false;
        		continue;
        	}
        	if(nums.contains(sArr[i])) {
        		sb.append(sArr[i]);      		
        	}else {
        		sb.append(sArr[i].toLowerCase());
        	}
        	first = false;
        }
        answer = sb.toString();
        return answer;
    }
}