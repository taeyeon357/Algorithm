class Solution {
    public static int[] solution(int n, int m) {
        int[] answer = {};
        int gcdValue = gcd(n,m);
        int lcmValue = n*m/gcdValue;
        
        answer = new int[]{gcdValue, lcmValue};
        return answer;
    }
    
    public static int gcd(int a, int b) {
    	if (a%b==0) {
    		return b;
    	}else {
    		return gcd(b, a%b);
    	}
    }
    
    
}