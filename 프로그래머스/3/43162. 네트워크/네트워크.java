import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int[] visited = new int[n];
        int answer = 0;
        
        // bfs
        /*
        Queue<Integer> q = new LinkedList<>();        
        for(int i=0; i<n; i++){
            if(visited[i] == 0){
                visited[i] = 1;
                q.offer(i);
                answer++;
            }else{
                continue;
            }
            while(!q.isEmpty()){
                int cur = q.poll();
                for(int j=0; j<n; j++){
                    if(computers[cur][j] == 1 && visited[j] == 0){
                        q.offer(j);
                        visited[j] = 1;
                    }
                }
            }  
        }
        */
        
        // dfs
        for(int i=0; i<n; i++){
            if(visited[i] == 0){
                dfs(computers, visited, i);
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int[][] com, int[] visited, int start){
        visited[start] = 1;
        for(int i=0; i<com[start].length; i++){
            if(com[start][i] == 1 && visited[i] == 0){
                dfs(com, visited, i);
            }
        }
    }
}