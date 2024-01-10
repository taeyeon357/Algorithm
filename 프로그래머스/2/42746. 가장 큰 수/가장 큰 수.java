import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        List<String> numList = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++) {
        	String numStr = String.valueOf(numbers[i]);
        	numList.add(numStr);
        }
        
        Collections.sort(numList, Collections.reverseOrder());
        Collections.sort(numList, new Comparator<String>() {
        	@Override
        	public int compare(String o1, String o2) {
        		Double concatVal1 = Double.parseDouble(o1+o2);
        		Double concatVal2 = Double.parseDouble(o2+o1);
        		
        		if(concatVal1 >= concatVal2) {
        			return -1;
        		}else {
        			return 1;
        		}
        	}
        });
        answer = String.join("", numList);
        if(answer.charAt(0) == '0'){
            answer = "0";
        }
        return answer;
    }
}