import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] dis = new int[n][m];
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        dis[0][0] = 1;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int i=0; i<4; i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if(nx<n && nx>=0 && ny<m && ny>=0 && maps[nx][ny] == 1 && dis[nx][ny] == 0 ){
                    dis[nx][ny] = dis[cur[0]][cur[1]] + 1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        return dis[n-1][m-1] == 0 ? -1 : dis[n-1][m-1];
    }
}