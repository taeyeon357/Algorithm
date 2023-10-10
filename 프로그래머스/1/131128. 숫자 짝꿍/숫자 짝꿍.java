import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        char[] arr_x = X.toCharArray();
        char[] arr_y = Y.toCharArray();
        Arrays.sort(arr_x); // 오름차순 정렬
        Arrays.sort(arr_y);
        
        int i = X.length() - 1;
        int j = Y.length() - 1;
        
        List<String> pair = new ArrayList<>();
        while(i >= 0 && j >= 0){
            char x = arr_x[i];
            char y = arr_y[j];
            
            if(x == y){
                pair.add(Character.toString(x));
                i--;
                j--;
            } else if(x>y){
                i--;
            } else{
                j--;
            }
        }
        
        Collections.sort(pair, Collections.reverseOrder());
        
        if(pair.size() == 0){
            answer = "-1";
        } else if("0".equals(pair.get(0))){
            answer = "0";
        } else{
            answer = String.join("", pair);
        }
        
        return answer;
    }
}