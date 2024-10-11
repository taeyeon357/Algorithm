import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        

        for(int i=0; i<n; i++){
            String[] input = sc.nextLine().split(" ");
            map.put(input[0], map.getOrDefault(input[0], 0)+1);
        }

        List<String> name = new ArrayList<>();
        for(String key : map.keySet()){
            if(map.get(key)%2==1) name.add(key);
        }
        Collections.sort(name, Collections.reverseOrder());

        for(String ans : name) System.out.println(ans);
    }   
}
