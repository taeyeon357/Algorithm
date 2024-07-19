class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int idx = 0, min;
        for(int[] q : queries){
            min = 1000001;
            for(int i=q[0]; i<=q[1]; i++){
                if(arr[i] > q[2] && arr[i] < min){
                    min = arr[i];
                }
            }
            if(min == 1000001) answer[idx++] = -1;
            else answer[idx++] = min;
        }
        
        return answer;
    }
}