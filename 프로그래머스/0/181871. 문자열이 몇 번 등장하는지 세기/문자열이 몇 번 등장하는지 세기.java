class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        int idx;
        while(true){
            idx = myString.indexOf(pat);
            if(idx > -1) {
                cnt++;
                myString = myString.substring(idx+1);
            }else
                break;
        }
        return cnt;
    }
}