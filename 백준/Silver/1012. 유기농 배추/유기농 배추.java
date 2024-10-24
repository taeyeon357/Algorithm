import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int ans;

        for(int t=0; t<T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            ans = 0;
            Queue<int[]> bfs = new LinkedList<>();
            int[][] board = new int[n][m];
            for(int i=0; i<k; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                board[y][x] = 1;
            }
            for(int r=0; r<n; r++){
                for(int c=0; c<m; c++){
                    if(board[r][c]==1){
                        bfs.offer(new int[]{r, c});
                        board[r][c] = 0;
                        while(!bfs.isEmpty()){
                            int[] now = bfs.poll();
                            for(int a=0; a<4; a++){
                                int nx = now[0] + dx[a];
                                int ny = now[1] + dy[a];
                                if(nx>=0 && ny>=0 && nx < n && ny < m && board[nx][ny] == 1){
                                    bfs.offer(new int[]{nx, ny});
                                    board[nx][ny] = 0;
                                }
                            }
                        }
                        ans++;
                    }
                }
   
            }

            System.out.println(ans);
            
        }
 
    }
}
