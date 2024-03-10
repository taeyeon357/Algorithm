import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        int D = Integer.parseInt(input[2]);
        
        int endTime = N*L + (N-1)*5;
        
        List<Integer> time = new ArrayList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<L; j++){
                time.add(1);
            }
            for(int j=0; j<5; j++){
                time.add(0);
            }
        }

        int bell = D;
        while(bell < endTime){
            if(time.get(bell)==0){
                break;
            }else{
                bell += D; 
            }
        }
        
        System.out.println(bell);
    }
}