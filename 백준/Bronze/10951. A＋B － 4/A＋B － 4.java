import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a, b;
      
        StringTokenizer st;
        while(sc.hasNext()){
            st = new StringTokenizer(sc.nextLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            System.out.println(a+b);
        }
    
        sc.close();
    }
}