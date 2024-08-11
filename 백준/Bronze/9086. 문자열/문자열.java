import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        String s;
        for(int t=0; t<T; t++){
            s = sc.next();
            System.out.println(""+s.charAt(0)+s.charAt(s.length()-1));
        }
    }
}
