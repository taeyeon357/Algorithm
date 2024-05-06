class Solution {
    public String solution(String my_string, String letter) {
        //replace -> 문자열, replaceAll -> 정규식
        return my_string.replace(letter, "");
    }
}