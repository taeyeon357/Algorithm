class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a) {
        	int exchange = n/a; //바꿀 수 있는 횟수
        	n -= (a * exchange); 
        	n += (b * exchange);
        	answer += b * exchange;
        }
        return answer;
    }
}