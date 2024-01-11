class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        triangle[1][0] += triangle[0][0];
        triangle[1][1] += triangle[0][0];
        if(triangle.length >= 2) {
        	for(int i=2; i<triangle.length; i++) {
        		triangle[i][0] += triangle[i-1][0];
        		for(int j=1; j<i; j++) {
        			triangle[i][j] += Math.max(triangle[i-1][j], triangle[i-1][j-1]);
        		}
        		triangle[i][i] += triangle[i-1][i-1];
        	}
        }
        
        for(int i=0; i<triangle.length; i++) {
        	if(triangle[triangle.length-1][i] >= answer) {
        		answer = triangle[triangle.length-1][i];
        	}
        }
        
        return answer;
    }
}