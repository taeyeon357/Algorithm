import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int k, n; //k층 n호
        for(int t=0; t<T; t++){
            k = sc.nextInt();
            n = sc.nextInt();
            int dp[][] = new int[k+1][n+1];
            for(int i=1; i<=n; i++){
                dp[0][i] = i;
            }
            for(int i=1; i<=k; i++){//층
                for(int j=1; j<=n; j++){
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
            System.out.println(dp[k][n]);
        }
    }
}