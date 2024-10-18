import java.util.*;
import java.io.*;

public class Main {
    static int ans = 0;
    static int[][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] maze = new int[n][m];
        visited = new int[n][m];
        String input;
        for(int i=0; i<n; i++){
            input = br.readLine();
            for(int j=0; j<m; j++){
               maze[i][j] = input.charAt(j)-'0';
            }
            
        }

        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        visited[0][0] = 1;
        int len;
        boolean flag = false;
        while(!q.isEmpty()){
            if(flag) break;
            len = q.size();
            for(int i=0; i<len; i++){
                int[] tmp = q.poll();
                if(tmp[0] == n-1 && tmp[1] == m-1){
                    flag = true;
                    break;
                }
                for(int k=0; k<4; k++){
                    int nx = tmp[0] + dx[k];
                    int ny = tmp[1] + dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<m && maze[nx][ny] == 1 && visited[nx][ny] == 0){
                        q.offer(new int[]{nx, ny});
                        visited[nx][ny] = visited[tmp[0]][tmp[1]]+1;
                    }
                }
            }
        }

        System.out.println(visited[n-1][m-1]);

    }   
}
