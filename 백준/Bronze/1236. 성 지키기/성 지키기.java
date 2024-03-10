import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[][] arr = new String[n][m];
        for(int i=0; i<n; i++){
            arr[i] = br.readLine().split("");
        }

        int[] row = new int[n];
        int[] col = new int[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j].equals("X")){
                    row[i] += 1;
                    col[j] += 1;
                }
            }
        }
        List<Integer> rowList = Arrays.stream(row).boxed().collect(Collectors.toList());
        int rowCnt = Collections.frequency(rowList, 0);

        List<Integer> colList = Arrays.stream(col).boxed().collect(Collectors.toList());
        int colCnt = Collections.frequency(colList, 0);

        System.out.println(Math.max(rowCnt, colCnt));
    }
}