import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0])-1;
        int b = Integer.parseInt(input[1])-1;

        int result = Math.abs(a%4 - b%4);
        result += Math.abs(a/4 - b/4);
    
        System.out.println(result);
    }
}