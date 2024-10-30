import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n==0 || n==1) System.out.println(1);
        else{
            int ans = 1;
            while(n>0){
                ans *= (n--);
            }
            System.out.println(ans);
        }
    }
}