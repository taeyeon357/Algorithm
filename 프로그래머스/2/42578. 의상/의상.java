import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
       int answer = 1;
       Map<String, Integer> category = new HashMap<>();
       for(int i=0; i<clothes.length; i++) {
    	   String type = clothes[i][1];
    	   if(category.containsKey(type)) {
    		   category.put(type, category.get(type)+1);
    	   }else {
    		   category.put(type, 1);
    	   }
       }
       
       //a가지 b가지 c가지 -> (a+1)(b+1)(c+1)-1 = abc + ab + bc + ac + a + b + c + 1 -1
       for(int n : category.values()) {
    	   answer *= (n+1);
       }
		
       return answer-1;
    }
}