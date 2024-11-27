import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        String[] cmd;
        int f=0;
        int b=0; //back+1
        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++){          
            cmd = br.readLine().split(" ");
            if(cmd[0].equals("push")){
                list.add(cmd[1]);
                b++;
            }else if(cmd[0].equals("pop")){
                if(f==b) sb.append(-1+"\n");
                else{
                    sb.append(list.get(f++)+"\n");
                }
            }else if(cmd[0].equals("size")){
                sb.append((b-f)+"\n");
            }else if(cmd[0].equals("empty")){
                if(b==f) sb.append(1+"\n");
                else sb.append(0+"\n");
            }else if(cmd[0].equals("front")){
                if(f==b) sb.append(-1+"\n");
                else sb.append(list.get(f)+"\n");
            }else if(cmd[0].equals("back")){
                if(f==b) sb.append(-1+"\n");
                else sb.append(list.get(b-1)+"\n");
            }
        }

        System.out.print(sb);
    }
}
