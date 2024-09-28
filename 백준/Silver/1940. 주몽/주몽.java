import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ing = new int[n];
        for(int i=0; i<n; i++) ing[i] = sc.nextInt();
        
        Arrays.sort(ing);

        int i=0;
        int j=n-1;
        int ans = 0;
        while(i<j){
            if(ing[i]+ing[j] == m){
                ans++;
                i++;
                j--;
            }else if(ing[i]+ing[j] < m){
                i++;
            }else{
                j--;
            }

        }

        System.out.println(ans);
    }
}

  