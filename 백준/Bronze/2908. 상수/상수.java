import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        if(a%10 > b%10){
            result = a;
        }else if(a%10 < b%10){
            result = b;
        }else if((a%10 == b%10) && (a/10 > b/10)){
            result = a;
        }else if((a%10 == b%10) && (a/10 < b/10)){
            result = b;
        }else if((a/100 > b/100)){
            result = a;
        }else if((a/100 < b/100)){
            result = b;
        }
        
        System.out.println((result%10)*100+((result/10)%10*10)+result/100);
    }
}
