import java.util.*;

class Solution {
    static boolean[] visited;
    static int cnt = 0;
       
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        
        visited = new boolean[dungeons.length];
        
        explore(k, dungeons, 0);

        return cnt;
    }
    
    public void explore(int k, int[][] d, int depth) {
        for(int i=0; i<d.length; i++) {
            if(!visited[i] && k >= d[i][0]) {
                visited[i] = true;
                explore(k-d[i][1], d, depth+1);
                visited[i] = false;
            }
        }
        cnt = Math.max(cnt, depth);
		
	}
}