class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long needMoney = 0;
        for(int i=1; i<=count; i++) {
        	needMoney += (i*price);
        }
        
        if(needMoney <= money) {
        	answer = 0;
        }else {
        	answer = needMoney - money;
        }
        return answer;
    }
}