import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] info = new int[n+1][5];
        for(int i=1; i<=n; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<5; j++){
                info[i][j] = Integer.parseInt(input[j]);
            }
        }

        int maxCnt = 0;
        int captain = 1;
        for(int i=1; i<=n; i++){
            Set<Integer> hs = new HashSet<>();
            for(int j=1; j<=n; j++){
                if(i!=j){
                    for(int k=0; k<5; k++){
                        if(info[i][k] == info[j][k]){
                            hs.add(j);
                        }
                    }
                }
            }
            if(maxCnt < hs.size()){
                maxCnt = hs.size();
                captain = i;
            }else if(maxCnt == hs.size()){
                captain = captain > i ? i : captain;
            }
        }
        System.out.println(captain);
    }
}