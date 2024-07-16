class Solution {
    public int solution(int[] num_list) {
        int cnt = 0;
        for(int num : num_list){
            while(num != 1){
                num /= 2;
                cnt++;
            }
        }
        return cnt;
    }
}