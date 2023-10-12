class Solution {
    public int solution(int a, int b, int n) {//빈 병 a병 가져다 주면 콜라 b병
        int answer = 0;
        while(n>=a) {
        	int exchange = n/a; //현재 빈 병으로 몇 번 바꿔 먹을 수 있는지
        	n -= (a * exchange); //빈병 소모
        	n += (b * exchange); //새 콜라 == 빈병 추가
        	answer += b * exchange; //바꿔 먹은 코라
        }
        return answer;
    }
}
