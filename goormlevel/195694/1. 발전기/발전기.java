import java.io.*;
import java.util.*;

class Main {
	static int n;
	static int ans = 0;
	static int[][] visited;
	static int[][] map;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		for(int i=0; i<n; i++){
			String[] input = br.readLine().split(" ");
			
			for(int j=0; j<n; j++){
				map[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		visited = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(dfs(i,j)){
					ans++;
				}
			}
		}
		
		System.out.println(ans);
	}
	
	public static boolean dfs(int x, int y){
		if(x < 0 || y < 0 || x >= n || y >= n || map[x][y]==0 || visited[x][y] == 1){
			return false;
		}
		Stack<int[]> stk = new Stack<>();
		stk.add(new int[]{x,y});
		visited[x][y] = 1;
		while(!stk.isEmpty()){
			int[] cur = stk.pop();
			int curX = cur[0];
			int curY = cur[1];
			
			for(int i=0; i<4; i++){
				int nx = curX+dx[i];
				int ny = curY+dy[i];
				if(nx < n && ny < n && nx > -1 && ny > -1 && map[nx][ny]==1 && visited[nx][ny]==0){
					visited[nx][ny] = 1;
					stk.add(new int[]{nx,ny});
				}
			}
		}
		
		return true;
	}
}