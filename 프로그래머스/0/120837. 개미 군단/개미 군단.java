class Solution {
    public int solution(int hp) {
        int answer = 0;
        answer += (hp/5);
        answer += ((hp%5)/3);
        answer += (hp%5)%3;
        
        return answer;
    }
}