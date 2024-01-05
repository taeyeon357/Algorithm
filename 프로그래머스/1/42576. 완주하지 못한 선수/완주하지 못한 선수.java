import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> participantMap = new HashMap<>();
        for(int i=0; i<participant.length; i++) {
        	//참여자
        	if(participantMap.keySet().contains(participant[i])) {
        		participantMap.put(participant[i], participantMap.get(participant[i])+1);
        	}else{
        		participantMap.put(participant[i], 1);
        	}
        }
        
        for(int i=0; i<completion.length; i++) {
        	//완주자
        	participantMap.put(completion[i], participantMap.get(completion[i])+1);
        }
        
        for(String key: participantMap.keySet()) {
        	if(participantMap.get(key) %2 == 1) {
        		answer = key;
        		break;
        	}
        }
        
        return answer;
    }
}