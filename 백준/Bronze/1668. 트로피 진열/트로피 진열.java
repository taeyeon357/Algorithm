import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int before = arr[0];
        int left = 1;
        for(int i=1; i<n; i++){
            if(arr[i] > before){
                before = arr[i];
                left += 1;
            }
        }

        before = arr[n-1];
        int right = 1;
        for(int i=n-2; i>-1; i--){
            if(arr[i] > before){
                before = arr[i];
                right += 1;
            }
        }

        System.out.println(left);
        System.out.println(right);
    }
}