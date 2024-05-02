class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<rsp.length(); i++){
            if(rsp.charAt(i) == '2'){//가위
                sb.append(0);
            }else if(rsp.charAt(i) == '0'){//바위
                sb.append(5);
            }else{//보
                sb.append(2);
            }
        }
        return sb.toString();
    }
}