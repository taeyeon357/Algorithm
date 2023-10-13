class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
        	if(minVal > Integer.parseInt(arr[i])) {
        		minVal = Integer.parseInt(arr[i]);
        	}
            if(maxVal  < Integer.parseInt(arr[i])) {
        		maxVal = Integer.parseInt(arr[i]);
        	}
        }
        answer = String.valueOf(minVal) + " " + String.valueOf(maxVal);
        
        return answer;
    }
}