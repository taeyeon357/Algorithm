import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=(int)'a'; i<=(int)'z'; i++){
            hm.put((char)i, -1);
        } 

        char[] cArr = S.toCharArray();
        for(int i=0; i<cArr.length; i++){
            if(hm.get(cArr[i]) == -1){
                hm.put(cArr[i], i);
            }
        }

        for(int i=(int)'a'; i<=(int)'z'; i++){
            System.out.print(hm.get((char)i)+" ");
        }
    }
}
