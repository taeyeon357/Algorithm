class Solution {
    public int[][] solution(int[][] arr) {
        int n = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[n][n];
        
        if(arr.length > arr[0].length){
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    answer[i][j] = arr[i][j];
                }
                for(int j=arr[0].length; j<n; j++){
                    answer[i][j] = 0;
                }
            }
        }else if(arr.length < arr[0].length){
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    answer[i][j] = arr[i][j];
                }
            }
            for(int i=arr.length; i<n; i++){
                for(int j=0; j<arr[0].length; j++){
                    answer[i][j] = 0;
                }
            }
        }else{
            return arr;
        }
        return answer;
    }
}