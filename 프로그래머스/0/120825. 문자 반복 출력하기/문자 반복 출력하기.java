class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            sb.append(String.valueOf(my_string.charAt(i)).repeat(n));
        }
        return sb.toString();
    }
}