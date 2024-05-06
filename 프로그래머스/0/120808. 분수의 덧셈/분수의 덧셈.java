class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int dn = denom1 * denom2;
        int nm = numer1*denom2 + numer2*denom1;
        
        
        if(nm%dn==0){
            nm/=dn;
            dn=1;
        }
        if(dn%nm==0){
            dn/=nm;
            nm=1;
        }
        
        int div = 2;
        while(dn >= div && nm >= div){
            if(dn%div==0 && nm%div==0){
                dn /= div;
                nm /= div;
            }
            div++;
        }
        answer[0] = nm;
        answer[1] = dn;
        return answer;
    }
}