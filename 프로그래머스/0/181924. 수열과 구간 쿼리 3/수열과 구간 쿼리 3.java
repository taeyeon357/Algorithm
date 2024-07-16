class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int a,b,tmp;
        for(int i=0; i<queries.length; i++){
            a = queries[i][0];
            b = queries[i][1];
            
            tmp = arr[b];
            arr[b] = arr[a];
            arr[a] = tmp;
        }
        return arr;
    }
}