class Solution {
    int[] dr = {1,-1,0,0,-1,-1,1,1}; //x&&row
    int[] dc = {0,0,1,-1,1,-1,1,-1}; //y&&col
    
    int ans = Integer.MAX_VALUE;
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] board = new int[101][101];
        int[][] visited = new int[101][101];
        for(int i=0; i<rectangle.length; i++){
            int[] dot = rectangle[i];
            for(int x=dot[0]*2; x<=dot[2]*2; x++){
                board[dot[1]*2][x] = i+1; //아랫면
                board[dot[3]*2][x] = i+1; //윗면
     
            }
            
            for(int y=dot[1]*2; y<=dot[3]*2; y++){
                board[y][dot[0]*2] = i+1; //왼쪽면
                board[y][dot[2]*2] = i+1; //오른쪽면
            } 
        }
        visited[characterX*2][characterY*2] = 1;
        dfs(characterX*2, characterY*2, itemX*2, itemY*2, 0, board, visited);
        
        return ans;
    }
    
    boolean isValid(int x, int y, int[][] board){
        int cnt = 0;
        for(int i=0; i<8; i++){
            int nr = y + dr[i];
            int nc = x + dc[i];
            
            if(nr>=0 && nr<=100 && nc>=0 && nc<= 100 && board[nr][nc] != 0) cnt++;
        }
        return cnt < 8;
    }
    
    void dfs(int curX, int curY, int itemX, int itemY, int L, int[][] board, int[][] visited){
        if(curX==itemX && curY==itemY){
            ans = Math.min(ans, L);
            return;
        }else{
            int x, y;
            for(int i=0; i<4; i++){
                x = curX + dc[i];
                y = curY + dr[i];
                if(isValid(x,y,board) && board[y][x] > 0 && visited[y][x] == 0){
                    //System.out.println("[X : " + x + "] [Y: " + y);
                    visited[y][x] = 1;
                    dfs(x,y,itemX,itemY,L+1,board,visited);
                    visited[y][x] = 0;
                }
            }
        }
    }
}