class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month_num = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int plus_day = 0;
        if(a==1) {
        	plus_day = b - 1;
        }else {
        	for(int i=1; i<a; i++) {
        		plus_day += month_num[i];
        	}
        	plus_day += b;
        	plus_day -= 1; //1월 1일 기준이기에
        }
        
        answer = day[plus_day % 7];
        return answer;
    }
}