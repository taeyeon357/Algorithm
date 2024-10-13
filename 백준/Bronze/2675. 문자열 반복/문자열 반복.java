import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for(char c : s.toCharArray()){
                for(int j=0; j<n; j++) sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}
