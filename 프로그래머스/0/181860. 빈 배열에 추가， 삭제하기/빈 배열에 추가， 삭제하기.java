import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        //문자열 형태로 원소를 추가 및 제거
        String str = "";
        for(int i=0; i<flag.length; i++){
            if(flag[i]){
                str += (""+arr[i]).repeat(arr[i]*2);
            }    
            else{
                str = str.substring(0, str.length() - arr[i]);
            }
        }

        //문자열을 각 자리별로 split해서 int배열에 저장
        String[] strArr = str.split("");
        int[] ans = new int[strArr.length];
        for(int i=0; i<ans.length; i++){
            ans[i] = Integer.parseInt(strArr[i]);
        }
        /* 스트림 활용 문자열 -> 정수 배열
        
        Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
        */
        return ans;
    }
}