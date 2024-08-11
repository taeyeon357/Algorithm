import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n+1];

        int i,j,k;
        for(int a=0; a<m; a++){
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();

            for(int t=i; t<=j; t++){
                basket[t] = k;
            }
        }   

        for(int t=1; t<=n; t++){
            System.out.print(basket[t]+" ");
        }
    }
}
