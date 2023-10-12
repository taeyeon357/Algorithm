import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> aList = new ArrayList<>();
        int[] correct = new int[3];
        
        int aIdx = 0;
        int supo1 = 1;
        int supo2 = 2;
        int supo3 = 3;
        while(aIdx < answers.length) {
        	//수포자 1
        	if(supo1 == 6) supo1 = 1;
      
        	//수포자 2
        	if(aIdx%2==0) supo2 = 2;
        	else if(aIdx%8==1) supo2 = 1;
        	else if(aIdx%8==3) supo2 = 3;
        	else if(aIdx%8==5) supo2 = 4;
        	else if(aIdx%8==7) supo2 = 5;
        	
        	//수포자 3
        	if(aIdx%10==0||aIdx%10==1) supo3 = 3;
        	else if(aIdx%10==2||aIdx%10==3) supo3 = 1;
        	else if(aIdx%10==4||aIdx%10==5) supo3 = 2;
        	else if(aIdx%10==6||aIdx%10==7) supo3 = 4;
        	else if(aIdx%10==8||aIdx%10==9) supo3 = 5;
        	
        	
        	if(answers[aIdx] == supo1) {
        		correct[0] += 1;
        	}
        	if(answers[aIdx] == supo2) {
        		correct[1] += 1;
        	}
        	if(answers[aIdx] == supo3) {
        		correct[2] += 1;
        	}
        	supo1++;
        	aIdx++;
        }
        
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<correct.length; i++) {
        	if(maxVal < correct[i]) {
        		maxVal = correct[i];
        	}
        }
        for(int i=0; i<correct.length; i++) {
        	if(correct[i] == maxVal) {
        		aList.add(i+1);
        	}
        }
        
        Collections.sort(aList);
        answer = aList.stream().mapToInt(a->a).toArray();
        return answer;
    }
}