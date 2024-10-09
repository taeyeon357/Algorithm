import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] score = new int[10];
        for(int i=0; i<10; i++) score[i] = sc.nextInt();

        int diff = Math.abs(100-score[0]);
        int ans = score[0];
        for(int i=1; i<10; i++){
            score[i] += score[i-1];
            if(diff >= Math.abs(100-score[i])){
                diff = Math.abs(100-score[i]);
                ans = score[i];
            }
        }
        System.out.println(ans);
    }
}