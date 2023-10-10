import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int n = board.length;
        List<Integer> selected = new ArrayList<>();
        int[] top = new int[board.length]; 
        
        for(int j =0; j<n; j++) {
        	for(int i=0;i<n;i++) {
        		if(board[i][j]!=0) {
        			top[j] = i;
        			i = n;
        		}
        	}
        }
        
        
        for(int m : moves) {
        	int col = m-1; 
        	if(board[top[col]][col] != 0) {
        		selected.add(board[top[col]][col]);
        		board[top[col]][col] = 0;
        		if(top[col]<n-1) {
        			top[col] += 1;
        		}
        	}

        	if(selected.size() > 1) {
        		if(selected.get(selected.size()-2).equals(selected.get(selected.size()-1))) {
        			selected.remove(selected.size()-2);
        			selected.remove(selected.size()-1);
        			answer += 2;
        		}
        	}
        }
        return answer;
    }
}