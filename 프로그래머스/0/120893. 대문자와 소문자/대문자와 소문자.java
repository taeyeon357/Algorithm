class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] arr = my_string.toCharArray();
        for(int i=0; i<my_string.length(); i++){
            if(arr[i] >= 'a'){ //소문자
                sb.append((arr[i]+"").toUpperCase());
            }else{//대문자
                sb.append((arr[i]+"").toLowerCase());
            }
        }
        return sb.toString();
    }
}