import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        List<Integer> time = new ArrayList<>();
        for(int i=1; i<=n; i++){
            int a = Integer.parseInt(br.readLine());
            for(int j=0; j<a; j++){
                time.add(i);
            }
        }
        for(int i=0; i<q; i++){
            int b = Integer.parseInt(br.readLine());
            System.out.println(time.get(b));
        }
    }
}