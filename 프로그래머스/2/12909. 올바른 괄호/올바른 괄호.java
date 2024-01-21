class Solution {
    boolean solution(String s) {
        boolean answer = false;

        int check = 0;
        for(int i=0; i<s.length(); i++){
            if(check == -1) {
                break;
            }
            
            if(s.charAt(i)=='('){
                check += 1;
            }else{
                check -= 1;
            }
        }
        
        if(check==0) answer = true;
        
        return answer;
    }
}