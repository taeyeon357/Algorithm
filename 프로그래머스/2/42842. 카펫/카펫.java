class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int b = 0;
        if(yellow==1) {answer[0] = 3; answer[1] = 3;}
        for(int i=1; i<=(yellow/2); i++) {
            if(yellow%i==0){
        	    b = (yellow/i)*2 + i*2 + 4;
        	    if(b==brown) {
        		    answer[0] = yellow/i+2;
        		    answer[1] = i+2;
        		    break;
        	    }
            }
        }
        return answer;
    }
}