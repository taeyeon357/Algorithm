import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("all")){
                ans = (1<<21) - 1;
            }else if(str.equals("empty")){
                ans = 0;
            }else{
                int x = Integer.parseInt(st.nextToken());
                if(str.equals("add")){
                    ans |= (1<<x);
                }else if(str.equals("remove")){
                    ans &= ~(1<<x);
                }else if(str.equals("check")){
                    sb.append((ans & (1<<x)) != 0 ? 1 : 0).append("\n");
                }else if(str.equals("toggle")){
                    ans ^= (1<<x);
                }
            }
        }
        System.out.println(sb);
    }
}
