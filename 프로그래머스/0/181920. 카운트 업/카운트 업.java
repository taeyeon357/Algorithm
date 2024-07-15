class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] ans = new int[end_num - start_num + 1];
        int idx = 0;
        for(int i=start_num; i<=end_num; i++){
            ans[idx++] = i;
        }
        return ans;
    }
}