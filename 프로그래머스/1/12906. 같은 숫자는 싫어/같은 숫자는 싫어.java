import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stk = new Stack<>();
        
        stk.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(stk.peek() != arr[i]){
                stk.add(arr[i]);
            }
        }
        answer = new int[stk.size()];
        for(int i=stk.size()-1; i>-1; i--){
            answer[i] = stk.pop();
        }
        
        return answer;
    }
}