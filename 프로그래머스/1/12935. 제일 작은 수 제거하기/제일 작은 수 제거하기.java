import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        int minValue = arr[0];
        for (int a : arr){
            if (a < minValue){
                minValue = a;
            }
        }
        
        List<Integer> arrList = new ArrayList<>();
        for(int a: arr) {
        	if (a!=minValue) {
        		arrList.add(a);
        	}
        }
        
        if(arrList.size() == 0) {
        	arrList.add(-1);
        }
        answer = arrList.stream().mapToInt(a -> a).toArray();
        return answer;
    }
}