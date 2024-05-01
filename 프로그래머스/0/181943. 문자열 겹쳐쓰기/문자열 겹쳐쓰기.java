class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            if(i!=s) sb.append(my_string.charAt(i));
            if(i==s){
                sb.append(overwrite_string);
                i+=(overwrite_string.length()-1);
            }
        }
        answer = sb.toString();
        return answer;
    }
}