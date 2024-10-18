import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n+1][n+1];
        int[] visited = new int[n+1];
        visited[1] = 1;

        StringTokenizer st;
        int a, b;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        while(!q.isEmpty()){
            int tmp = q.poll();            
            for(int i=1; i<=n; i++){
                if(arr[tmp][i]==1 && visited[i]==0){
                    q.offer(i);
                    visited[i] = 1;
                }
            }
        }

        System.out.println(Arrays.stream(visited).sum()-1);
    }
}
