import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(s1);

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        String s2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(s2);

        String s3 = br.readLine();
        StringTokenizer st3 = new StringTokenizer(s3);

        int[] boxSize = new int[n];
        for(int i=0; i<n; i++){
            boxSize[i] = Integer.parseInt(st2.nextToken());
        }
    
        int[] bookSize = new int[m];
        for(int i=0; i<m; i++){
            bookSize[i] = Integer.parseInt(st3.nextToken());
        }

        int[] boxes = new int[n];
        int bookIdx = 0;
        int result = 0;
        for(int i=0; i<n; i++){
            while(bookIdx < m && boxes[i] + bookSize[bookIdx] <= boxSize[i]){
                boxes[i] += bookSize[bookIdx++];
            }
            result += (boxSize[i] - boxes[i]);
        }

        System.out.println(result);

    } 
}
