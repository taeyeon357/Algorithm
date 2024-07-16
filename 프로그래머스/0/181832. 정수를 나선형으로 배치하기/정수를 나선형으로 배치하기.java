class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        int fill = 1;
        int row = 0;
        int col = 0;
        int size = n;
        while(fill <= n*n){
            if(fill == n*n){
                arr[row][col] = fill;
                break;
            }
            
            for(int i=0; i<size-1; i++){
                arr[row][col++] = fill++;
            }
            for(int i=0; i<size-1; i++){
                arr[row++][col] = fill++;
            }
            for(int i=0; i<size-1; i++){
                arr[row][col--] = fill++;
            }
            for(int i=0; i<size-1; i++){
                arr[row--][col] = fill++;
            }
            
            size -= 2;
            row += 1;
            col += 1;
        }
        return arr;
    }
    
   
}