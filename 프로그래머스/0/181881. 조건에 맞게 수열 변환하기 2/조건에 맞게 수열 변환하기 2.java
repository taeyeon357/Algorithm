import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int[] bf = Arrays.copyOfRange(arr, 0, arr.length);
        int cnt = 0;
        while(true){            
            bf = Arrays.copyOfRange(arr, 0, arr.length);
            for(int i=0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 ==0) arr[i] /= 2;
                else if(arr[i] < 50 && arr[i] % 2 == 1) arr[i] = arr[i] * 2 + 1;
            }            
            if(Arrays.equals(bf, arr)) 
                break;
            cnt++;
        }
        return cnt;
    }
}