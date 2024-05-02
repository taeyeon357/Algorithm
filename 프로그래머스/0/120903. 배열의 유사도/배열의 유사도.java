import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = s1.length;
        List<String> arr1 = new ArrayList<>(Arrays.asList(s1));
        List<String> arr2 = new ArrayList<>(Arrays.asList(s2));
        arr1.removeAll(arr2);
        answer -= arr1.size();
        return answer;
    }
}