import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        Set<Integer> hs = new HashSet<>(Arrays.asList(a,b,c));
        int ans = 0;
        
        if(hs.size() == 1){
            ans = (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }else if(hs.size() == 2){
            ans = (a+b+c) * (a*a + b*b + c*c);
        }else{
            ans = a+b+c;
        }
        return ans;
    }
}