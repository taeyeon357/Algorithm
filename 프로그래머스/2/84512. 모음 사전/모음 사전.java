import java.util.*;
import java.util.Collections;

class Solution {
    
    static ArrayList<String> dict = new ArrayList<>();
    
    public int solution(String word) {
        int answer = 0;
        String[] arr = new String[]{"A","E","I", "O", "U"};
        for(int i=1; i<=5; i++){
            makeWord(arr, 0, i, "");
        }
        
        Collections.sort(dict);
        for(int i=0; i<dict.size(); i++){
            if(dict.get(i).equals(word)){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
    
    public void makeWord(String[] arr, int L, int targetLen, String tmp){
        if(L==targetLen){
            dict.add(tmp);
            return;
        }else{
            for(int i=0; i<arr.length; i++){
                makeWord(arr, L+1, targetLen, tmp+arr[i]);
            }
        }
    }
}