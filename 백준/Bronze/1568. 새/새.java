import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sec = 0;
        int k = 1;
        while(n > 0){
            if(n>=k){
                n -= k;         
            }else{
                k = 1;
                n -= k;
            }
            sec += 1;
            k += 1;
        }
        System.out.println(sec);
    }
}