import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] room = new char[n][n];
        for(int i=0; i<n; i++){
            room[i] = br.readLine().toCharArray();
        }

                int row = 0;
        int col = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){

            cnt = 0;
            for(int j=0; j<n; j++){
                if(room[i][j] == '.') cnt ++;
                else{
                    if(cnt >= 2) row++;
                    cnt = 0;
                } 
            }
            if(cnt >= 2) row++;

            cnt = 0;
            for(int j=0; j<n; j++){
                if(room[j][i] == '.') cnt ++;
                else{
                    if(cnt >= 2) col++;
                    cnt = 0;
                }
            }
            if(cnt >= 2) col++;
        }

        System.out.println(row+" "+col);
    }
}
