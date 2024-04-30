import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int end = 1;
        int cnt = 1;
        while(n > end){
            end += (cnt++ * 6);
        }
        System.out.println(cnt);
    }
}