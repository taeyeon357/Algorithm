import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        int lr = -1;
        int idx = -1;
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                lr = 0;
                idx = i;
                break;
            }else if(str_list[i].equals("r")){
                lr = 1;
                idx = i;
                break;
            }
        }
        
        if(lr == 0){
            return Arrays.copyOfRange(str_list, 0, idx);
        }else if(lr == 1){
            return Arrays.copyOfRange(str_list, idx+1, str_list.length);
        }
        return new String[]{};
    }
}