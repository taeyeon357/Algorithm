import java.util.Arrays;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length > arr2.length){
            answer = 1;
        }else if(arr1.length < arr2.length){
            answer = -1;
        }else{
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            if(sum1 > sum2) answer = 1;
            else if(sum1 < sum2) answer = -1;
        }
        return answer;
    }
}