class Solution {
    public int solution(String[] order) {
        int sum = 0;
        for(String s : order){
            if(s.indexOf("latte") > -1) sum += 5000;
            else sum += 4500;
        }
        return sum;
    }
}