import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> numList = new ArrayList<>();
        
        while(n>0){
            numList.add(n%10);
            n /= 10;
        }
                        
        Collections.sort(numList);
        
        for(int i =0; i<numList.size(); i++){
            answer += numList.get(i) * Math.pow(10,i);
        }
        return answer;
    }
}