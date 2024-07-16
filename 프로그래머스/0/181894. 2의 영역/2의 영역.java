import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int s = -1, e = -1;
        for(int i=0; i<arr.length; i++){
            if(s == -1 && arr[i] == 2) s = i;
            if(s > -1 && arr[i] ==2){
                e = i;
            }
        }
        if(s == -1) return new int[]{-1};
        else if(e == -1) return Arrays.copyOfRange(arr, s, s+1);
        else return Arrays.copyOfRange(arr, s, e+1);
    }
}