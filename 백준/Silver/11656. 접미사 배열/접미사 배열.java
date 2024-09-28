import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = new String[s.length()];

        for(int i=0; i<arr.length; i++){
            arr[i] = s.substring(i);
        }

        Arrays.sort(arr);
        for(String str : arr){
            System.out.println(str);
        }

    }
}