import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a, b;
        while(true){
            try{
                a = sc.nextInt();
                b = sc.nextInt();
            }catch(Exception e){
                break;
            }
            
            System.out.println(a+b);
        }
        sc.close();
    }
}