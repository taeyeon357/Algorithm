import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nms = br.readLine().split(" ");
        int n = Integer.parseInt(nms[0]);
        int m = Integer.parseInt(nms[1]);

        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.putIfAbsent(arr[i], i);
        }

        for(int i=0; i<m; i++){
            int num = Integer.parseInt(br.readLine());
            System.out.println(map.getOrDefault(num, -1));
        }
    }    
}
