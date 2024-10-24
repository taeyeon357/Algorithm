import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ans = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=1; i<n; i++){
            arr[i] += arr[i-1];
        }

        for(int i=0; i<n; i++){
            if(arr[i] == m) ans++;
            for(int j=0; j<i; j++){
                if(arr[i] - arr[j] == m) ans++;
            }
        }

        System.out.println(ans);
    }
}