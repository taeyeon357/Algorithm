import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] cnt = new int[3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(input[i].equals(input[j])){
                    cnt[i]++;
                }
            }
        }

        int maxVal = Integer.MIN_VALUE;
        int maxIdx = 0;
        for(int i=0; i<3; i++){
            if(cnt[i] > maxVal){
                maxVal = cnt[i];
                maxIdx = i;
            }
        }

        int result = 0;
        if(maxVal == 3){
            result += (10000 + Integer.parseInt(input[maxIdx])*1000);
        }else if(maxVal == 2){
            result += (1000 + Integer.parseInt(input[maxIdx])*100);
        }else{
            maxVal = Integer.MIN_VALUE;
            for(int i=0; i<3; i++){
                if(Integer.parseInt(input[i]) > maxVal){
                    maxVal = Integer.parseInt(input[i]);
                }
                result = maxVal * 100;
            }
        }

        System.out.println(result);
    }
}