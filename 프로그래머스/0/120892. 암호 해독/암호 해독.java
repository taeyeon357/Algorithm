class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        char[] arr = cipher.toCharArray();
        for(int i=code-1; i<cipher.length(); i+=code){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}