import java.util.*;

class Solution {
    public boolean inRange(int row, int col, int n, int m) {
		return row>=0 && row<n && col >= 0 && col < m;
	}
    
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        
        int[][] map = new int[n][m];
        for(int i=0; i<n; i++) {
        	Arrays.fill(map[i], 0); //Arrays.fill은 1차원 배열에만 사용가능
        }
        for(int i=0; i<puddles.length; i++) {
        	map[puddles[i][1]-1][puddles[i][0]-1] = -1;
        }
        
        map[0][0] = 1;
        for(int i=0;i<n; i++) {
        	for(int j=0; j<m; j++) {
        			if(map[i][j] < 0) {
        				continue;
        			}
        			if(inRange(i,j-1,n,m) && map[i][j-1] > -1) {
        				map[i][j] = (map[i][j] + map[i][j-1])%1000000007;
        			}
        			if(inRange(i-1,j,n,m) && map[i-1][j] > -1) {
        				map[i][j] = (map[i][j] + map[i-1][j])%1000000007;
        			}
        	}
        }
        answer = map[n-1][m-1];
        
        return answer;
    }
}