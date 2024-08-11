import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n+1];
        for(int i=1; i<=n; i++){
            basket[i] = i;
        }

        int a, b, tmp;
        for(int i=0; i<m; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            
            for(int j=0; j<(b-a)/2+1; j++){
                tmp = basket[a+j];
                basket[a+j] = basket[b-j];
                basket[b-j] = tmp;
            }
        }

        for(int i=1; i<=n; i++){
            System.out.print(basket[i] + " ");
        }
    }
}