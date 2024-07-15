class Solution {
    public int solution(int a, int b) {
        int ans1 = Integer.parseInt(""+a+b);
        int ans2 = 2 * a * b;
        
        if(ans1 == ans2)
            return ans1;
        else
            return Math.max(ans1, ans2);
    }
}