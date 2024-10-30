import java.util.*;
import java.io.*;

public class Main {

        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        long rt = 0;
        for(int i=0; i<k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > rt) rt = arr[i];
        }
            
        rt++;
        long lt = 0;
        long mid = 0;
        int cnt;
        while(lt < rt){
            cnt = 0;
            mid = (lt+rt)/2;
            for(int i=0; i<k; i++){
                cnt += (arr[i]/mid);
            }
            if(cnt < n){
                rt = mid;
            }else{
                lt = mid + 1;
            }
        }

        System.out.println(rt-1);
    }
}