import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String files = br.readLine();
        StringTokenizer st = new StringTokenizer(files);

        long[] filesArr = new long[n];
        for(int i=0; i<n; i++){
            filesArr[i] = Long.parseLong(st.nextToken());
        }

        long c = Long.parseLong(br.readLine());

        long cnt = 0;
        for(int i=0; i<n; i++){
            if(filesArr[i] == 0){
                continue;
            }
            if(c >= filesArr[i]){
                cnt += 1;
            }else{
                if(filesArr[i]%c==0){
                    cnt += (filesArr[i]/c);
                }else{
                    cnt += (filesArr[i]/c + 1);
                }
            }
        }
        System.out.println(c * cnt);
    }
}