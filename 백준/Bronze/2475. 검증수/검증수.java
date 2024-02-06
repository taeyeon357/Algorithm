import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = bf.readLine().split(" ");
        int sum = 0;
        for(int i=0; i<5; i++){
            int n = Integer.parseInt(input[i]);
            sum += (n*n);
        }
        System.out.println(sum % 10);
    }
}