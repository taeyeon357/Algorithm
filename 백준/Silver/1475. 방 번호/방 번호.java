import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map = new HashMap<>();
        for(char c ='0'; c<'9'; c++){
            map.put(c, 0);
        }
        for(char c : br.readLine().toCharArray()){
            if(c=='6' || c=='9'){
                map.put('6', map.get('6')+1);
            }else{
                map.put(c, map.get(c)+1);
            }
        }
        map.put('6', (int)Math.ceil(map.get('6')/2.0));
        int max_val = Integer.MIN_VALUE;
        for(int num : map.values()){
            if(max_val < num) max_val = num;
        }
        System.out.println(max_val);
    }
}