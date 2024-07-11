class Solution {
    public int solution(String my_string, String target) {
        int tLen = target.length();
        int sLen = my_string.length();
        
        int start = 0;
        int end = tLen;
        while(end <= sLen){
            if(target.equals(my_string.substring(start,end))) return 1;
            start++;
            end++;
        }
        return 0;
    }
}