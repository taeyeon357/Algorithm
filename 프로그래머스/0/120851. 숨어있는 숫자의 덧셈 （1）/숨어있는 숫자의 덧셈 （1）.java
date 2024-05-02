class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] cArr = my_string.toCharArray();
        for(int i=0; i<my_string.length(); i++){
            int tmp = cArr[i] - '0';
            if(tmp<10) answer += tmp;
        }
        return answer;
    }
}