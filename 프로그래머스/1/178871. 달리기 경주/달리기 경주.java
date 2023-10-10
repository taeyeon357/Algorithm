import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> nameToNum = new HashMap<>();
        HashMap<Integer, String> numToName = new HashMap<>();
        
        for(int i=0; i<players.length; i++) {
        	nameToNum.put(players[i], i);
        	numToName.put(i, players[i]);
        }
        
        int winNum = 0;
        int loseNum = 0;
        String loseName = "";
        for(int i=0; i<callings.length; i++) {
        	winNum = nameToNum.get(callings[i]); //추월한 사람의 원래 등수
        	loseName = numToName.get(winNum - 1); //추월 당하는 사람의 이름
        	loseNum = nameToNum.get(loseName);
        	
        	nameToNum.put(callings[i], winNum-1); //등수 하나 땡기기
        	nameToNum.put(loseName, loseNum+1); //등수 하나 밀기
        	numToName.put(winNum-1, callings[i]);
        	numToName.put(loseNum+1, loseName);
        }
        
        for(int i : numToName.keySet()) {
        	answer[i] = numToName.get(i);
        }
        return answer;
    }
}