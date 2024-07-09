import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] cup = new boolean[4];
        cup[1] = true;
        
        int n = Integer.parseInt(st.nextToken());
        int x, y;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            
            if(cup[x]) {
                cup[y] = true;
                cup[x] = false;
            }
            else if(cup[y]) {
                cup[x] = true;
                cup[y] = false;
            }   
        }
        for(int i=1; i<=3; i++){
            if(cup[i]) {
                System.out.println(i);
                return ;
            }
        }
        System.out.println(-1);
        return ;
    }
}