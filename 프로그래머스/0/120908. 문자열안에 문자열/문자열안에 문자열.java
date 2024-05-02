class Solution {
    public int solution(String str1, String str2) {
        int answer = str1.length();
        str1 = str1.replaceAll(str2, "");
        
        return answer-str1.length()==0 ? 2 : 1;
    }
}