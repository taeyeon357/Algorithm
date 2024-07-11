class Solution {
    public int solution(String str1, String str2) {
        int len = str1.length();
        
        int start = 0;
        int end = start + len;
        while(end <= str2.length()){
            if(str1.equals(str2.substring(start, end))){
                return 1;
            }
            start++;
            end++;
        }
        return 0;
    }
}