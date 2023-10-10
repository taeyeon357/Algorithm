import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        answer = new int[targets.length];
        
        //중복제거
        HashSet<Character> targetKeys = new HashSet<>();
        
        //필요한 문자 저장(중복 제거)
        for(int i =0; i<targets.length; i++){
            for(int j =0; j<targets[i].length(); j++){
                targetKeys.add(targets[i].charAt(j));
            }
        }
        
        //key = 문자 value = 문자를 입력하기 위해 눌러야 하는 최소값
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character t : targetKeys){
            int minValue = 101;
            for(int i=0; i<keymap.length; i++){ //키맵에 존재하고, 최소값보다 더 작다면
                if(keymap[i].indexOf(t) > -1 && keymap[i].indexOf(t)<minValue){
                    minValue = keymap[i].indexOf(t);
                }
            }
            if(minValue==101){
                //키맵에 존재하지 않는다면
                map.put(t, -1);
            }else{
                //키맵에 존재한다면 -> minValue(index) + 1 : 실제 누르는 횟수
                map.put(t, minValue + 1); 
            }
        }
        
        for(int i =0; i<targets.length; i++){
            for(int j =0; j<targets[i].length(); j++){
                if(map.get(targets[i].charAt(j))==-1){
                    answer[i] = -1;
                    break;
                }
                answer[i] += map.get(targets[i].charAt(j));
            }
        }
        return answer;
    }
}