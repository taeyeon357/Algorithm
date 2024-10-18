import java.util.*;
import java.io.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        List<Integer> ans = new ArrayList<>();

        String input;
        for(int i=0; i<n; i++){
            input = br.readLine();
            for(int j=0; j<n; j++){
                map[i][j] = input.charAt(j) - '0';
            }
        }
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,-1,1};

        int[][] visited = new int[n][n];
        Queue<int[]> q = new LinkedList<>();
        int cnt;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] == 1 && visited[i][j] == 0){//단지 시작
                    cnt = 1;
                    q.offer(new int[]{i,j});
                    visited[i][j] = 1;
                    while(!q.isEmpty()){
                        int[] tmp = q.poll();

                        for(int d=0; d<4; d++){
                            int nx = tmp[0]+dx[d];
                            int ny = tmp[1]+dy[d];
                            if(nx>=0&&ny>=0&&nx<n&&ny<n&&map[nx][ny]==1&&visited[nx][ny]==0){
                                cnt++;
                                q.offer(new int[]{nx, ny});
                                visited[nx][ny] = 1;
                            }
                        }
                    }
                    ans.add(cnt);
                }
            }
        }

        Collections.sort(ans);
        
        int len = ans.size();
        System.out.println(len);
        for(int i=0; i<len; i++){
            System.out.println(ans.get(i));
        }
    }
}
