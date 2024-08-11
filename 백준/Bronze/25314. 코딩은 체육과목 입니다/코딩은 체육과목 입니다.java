import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String ans = "long int";
        
        int r = N - 4;
        if(r > 0){
            ans = "long ".repeat(r/4) + ans;
        }
        System.out.println(ans);

        sc.close();
    }
}