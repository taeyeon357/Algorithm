class Solution {
    public int solution(double flo) {
        StringBuilder sb = new StringBuilder();
        for(char d : String.valueOf(flo).toCharArray()){
            if(!Character.isDigit(d)) break;
            sb.append(d);
        }
        return Integer.parseInt(sb.toString());
    }
}