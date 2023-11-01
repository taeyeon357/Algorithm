import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] numArr = dartResult.split("[A-Z]");
        int[] result = new int[numArr.length];
        
        for(int i=0; i<numArr.length; i++) {
        	numArr[i] = numArr[i].replace("#", "");
        	numArr[i] = numArr[i].replace("*", "");
        }
        
        
        int bIdx = 0;
        for(int i=0; i<dartResult.length(); i++) {
        	if(Arrays.asList('S', 'D', 'T').contains(dartResult.charAt(i))) {
        		if(dartResult.charAt(i)=='S') {
        			result[bIdx] = Integer.parseInt(numArr[bIdx]);
        		}else if(dartResult.charAt(i)=='D') {
        			result[bIdx] = (int)Math.pow(Integer.parseInt(numArr[bIdx]),2);        			
        		}else if(dartResult.charAt(i)=='T') {
        			result[bIdx] = (int)Math.pow(Integer.parseInt(numArr[bIdx]),3);       			        			
        		}
        		bIdx += 1;
        	}else if(Arrays.asList('#', '*').contains(dartResult.charAt(i))) {
        		if(dartResult.charAt(i)=='*') {
        			if(bIdx > 1) {
        				result[bIdx-1] *= 2;
        				result[bIdx-2] *= 2;
        			}else {
        				result[bIdx-1] *= 2;        				
        			}
        		}else if(dartResult.charAt(i)=='#') {
        			result[bIdx-1] *= (-1);
        		}
        	}	
        }

        answer = Arrays.stream(result).sum();
        return answer;
    }
}