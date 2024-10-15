class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int w_b, w_s;
        if(wallet[0] > wallet[1]){
            w_b = wallet[0];
            w_s = wallet[1];
        }else{
            w_b = wallet[1];
            w_s = wallet[0];
        }
        
        int b_b, b_s;
        if(bill[0] > bill[1]){
            b_b = bill[0];
            b_s = bill[1];
        }else{
            b_b = bill[1];
            b_s = bill[0];
        }
        while(b_b > w_b || b_s > w_s ){
            b_b /= 2;
            answer++;
            if(b_b < b_s){
                int tmp = b_b;
                b_b = b_s;
                b_s = tmp;
            }
        }
        return answer;
    }
}