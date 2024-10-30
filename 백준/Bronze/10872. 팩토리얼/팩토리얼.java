import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] dp = new int[n+1];
        dp[0] = 1;
        if(n>0){
            dp[1] = 1;
            for(int i=2; i<=n; i++){
                dp[i] = dp[i-1]*i;
            }
        }
        System.out.println(dp[n]);
    }
}