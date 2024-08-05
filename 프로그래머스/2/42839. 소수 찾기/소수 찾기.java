import java.util.*;

class Solution {
    boolean[] isPrime;
    int[] used;
    int maxVal = Integer.MIN_VALUE;
    
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        used = new int[numbers.length()];
        for(int i=1; i<=numbers.length(); i++){
            makeNum(numbers, 0, i, "", set);
        }
        
        isPrime = new boolean[maxVal+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        primeCheck(maxVal);
        
        int cnt = 0;
        for(int i : set){
            if(isPrime[i]) {
                System.out.println(i);
                cnt++;
            }
        }
        
        
        return cnt;
    }
    
    public void makeNum(String num, int L, int targetLen, String tmp, Set<Integer> result){
        if(targetLen == L){
            int rs = Integer.parseInt(tmp);
            maxVal = Math.max(maxVal, rs);
            result.add(rs);
            return;
        }else{
            for(int i=0; i<num.length(); i++){
                if(used[i] == 0){
                    used[i] = 1;
                    makeNum(num, L+1, targetLen, tmp+num.charAt(i), result);
                    used[i] = 0;
                }
            }
        }
    }
    
        
    public void primeCheck(int num){
        if(num < 2){
            isPrime[num] = false;
            return;
        }else{
            for(int i=2; i<=num; i++){
                if(isPrime[i] == true){
                    for(int j = i*2; j<=num; j+=i){
                        isPrime[j] = false;
                    }
                }
            }
        }
    }
}