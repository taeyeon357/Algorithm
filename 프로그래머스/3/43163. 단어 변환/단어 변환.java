import java.util.*;

class Solution {
    int ans = Integer.MAX_VALUE;
    public int solution(String begin, String target, String[] words) {
        int[] used = new int[words.length];
        dfs(begin, target, words, used, 0);
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
    
    void dfs(String begin, String target, String[] words, int[] used, int depth){
        if(begin.equals(target)) {
            ans = Math.min(ans, depth);
            return;
        }else{
            for(int i=0; i<words.length; i++){
                if(isChangable(begin, words[i]) && used[i] == 0){
                    used[i] = 1;
                    dfs(words[i], target, words, used, depth+1);
                    used[i] = 0;
                }
            }
        }
    }
    
    boolean isChangable(String begin, String target){
        int len = begin.length();
        int cnt = 0;
        for(int i=0; i<len; i++){
            if(begin.charAt(i) == target.charAt(i)){
                cnt++;
            }
        }
        return cnt == len - 1 ? true : false;
    }
}