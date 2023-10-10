import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //3진법 저장할 리스트
        List<String> list = new ArrayList<>();
        
        //3진법 변환
        while(n>=3) {
        	list.add((n%3)+"");
        	n /= 3;
        }
        list.add(n+"");
        
        
        n = list.size()-1;
        for(int i=n;i>-1;i--) {
        	answer += (Math.pow(3, n-i) * Integer.parseInt(list.get(i)));
        }
        
        return answer;
    }
}