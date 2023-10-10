class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        String n_str = Long.toString(n);
        answer = new int[n_str.length()];
        
        for (int i=n_str.length()-1; i>=0; i--){
            answer[n_str.length()-1-i] = n_str.charAt(i) - (int)'0';
        }
        return answer;
    }
}