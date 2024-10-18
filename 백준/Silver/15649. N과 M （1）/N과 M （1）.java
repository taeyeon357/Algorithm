import java.util.*;
import java.io.*;
import java.util.Collections;

public class Main {
    static int n;
    static int m;
    static int[] visited;
    static int[] arr;
    static List<int[]> ans;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new int[n+1];
        arr = new int[m];
        dfs(0, 1);
    }

    public static void dfs(int i, int L){
        if(i==m){
            for(int num : arr){
                System.out.print(num+" ");
            }
            System.out.println();
            return;
        }
        for(int num=1; num<=n; num++){
            if(visited[num]==0){
                visited[num] = 1;
                arr[i] = num;
                dfs(i+1, num);
                visited[num] = 0;
            }
        }
    }
}
