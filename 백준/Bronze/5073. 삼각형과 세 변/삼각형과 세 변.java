import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String input = br.readLine();
            
            if(input.equals("0 0 0")){
                break;
            }
            
            StringTokenizer st = new StringTokenizer(input);  
        
            int[] len = new int[3];
            for(int i=0; i<3; i++){
                len[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(len);
            if(len[2] >= len[0]+len[1]){
                System.out.println("Invalid");
            }else{
                if(len[0]==len[1]&&len[1]==len[2]){
                    System.out.println("Equilateral");
                }else if(len[0]==len[1] || len[1]==len[2] || len[0]==len[2]){
                    System.out.println("Isosceles");
                }else{
                    System.out.println("Scalene");
                }
            }
        }
        
        
        
    }
}