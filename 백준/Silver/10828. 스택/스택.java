import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        String[] cmd;
        int len = 0;
        for(int i=0; i<n; i++){
            cmd = br.readLine().split(" ");
            if(cmd.length==1){
                if(cmd[0].equals("top")){
                    if(len==0) sb.append(-1+"\n");
                    else sb.append(list.get(len-1)+"\n");
                }else if(cmd[0].equals("size")){
                    sb.append(len+"\n");
                }else if(cmd[0].equals("empty")){
                    if(len==0) sb.append(1+"\n");
                    else sb.append(0+"\n");
                }else if(cmd[0].equals("pop")){
                    if(len==0) sb.append(-1+"\n");
                    else {
                        sb.append(list.get(--len)+"\n");
                        list.remove(len);
                    }
                } 
            }else{
                list.add(cmd[1]);
                len++;
            }
        }
        System.out.print(sb);
    }
}
