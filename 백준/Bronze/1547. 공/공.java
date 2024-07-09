import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] cup = new boolean[4];
        cup[1] = true;
        
        int n = sc.nextInt();
        int x, y;
        for(int i=0; i<n; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            
            if(cup[x]){
                cup[y] = true;
                cup[x] = false;
            }
            else if(cup[y]){
                cup[x] = true;
                cup[y] = false;
            }   
        }
        for(int i=1; i<=3; i++){
            if(cup[i]) {
                System.out.println(i);
                return ;
            }
        }
        System.out.println(-1);
        return ;
    }
}