import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] cArr = my_string.toCharArray();
        List<Character> vowel = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        for(int i=0; i<my_string.length(); i++){
            if(!vowel.contains(cArr[i])) sb.append(cArr[i]);
        }
        return sb.toString();
    }
}