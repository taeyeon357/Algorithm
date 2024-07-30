class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(0, numbers, 0, target);
    }
    
    public int dfs(int L, int[] numbers, int sum, int target){
        if(L==numbers.length){
            if(sum == target){
                return 1;   
            }
            return 0;
        }
        return dfs(L+1, numbers, sum + numbers[L], target) + dfs(L+1, numbers, sum - numbers[L], target);
    }
}