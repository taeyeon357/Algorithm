import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        
        int end = 0;
        list.add(words[0]);
        for(int i=1; i<words.length; i++){
            if(list.contains(words[i])){
                end = i;
                break;
            }
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                end = i;
                break;      
            }
            list.add(words[i]);
        } 
        if(list.size() == words.length){
            answer[0] = 0;
            answer[1] = 0;
        }else{
            answer[0] = end%n + 1;
            answer[1] = (int)Math.ceil(((double)end+1)/n);
        }

        return answer;
    }
}