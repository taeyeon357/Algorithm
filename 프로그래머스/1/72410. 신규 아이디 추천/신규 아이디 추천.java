import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        List<Character> list = Arrays.asList('~','!','@','#','$','%','^','&','*','(',')','=','+','[','{',']','}',':','?','<','>','/',',');
        
        StringBuilder sb = new StringBuilder();
        
        //1st & 2nd step
        for(int i=0; i<new_id.length(); i++) {
        	char c = new_id.charAt(i);
        	String cStr = Character.toString(c);
        	if(c>='A' && c <= 'Z') {
        		sb.append(Character.toLowerCase(c));
        	}else if(!(list.contains(c))) {
        		sb.append(c);
        	}
        }
        
        new_id = sb.toString();
        sb.setLength(0);
        
        //3rd step
        char before = new_id.charAt(0);
        sb.append(before);
        for(int i=1; i<new_id.length(); i++) {
        	char c = new_id.charAt(i);
        	if(c == '.' && before == c) {
        		continue;
        	}else {
        		sb.append(c);
        	}
        	before = c;
        	
        }
        
        new_id = sb.toString();
        sb.setLength(0);

        //4th step
        if(new_id.charAt(0) == '.') {
        	if(new_id.length() == 1) {
        		new_id = " ";
        	}else {
        		new_id = new_id.substring(1);
        	}
        }
        if(new_id.charAt(new_id.length()-1) == '.') {
        	if(new_id.length()==1) {
        		new_id = " ";
        	}else {        		
        		new_id = new_id.substring(0,new_id.length()-1);
        	}
        }    
        
        //5th & 6th step
        if(new_id.equals(" ")) {
        	new_id="a";
        }else if(new_id.length() > 15) {
        	new_id = new_id.substring(0,15);
            if(new_id.charAt(new_id.length()-1) == '.') {
            	new_id = new_id.substring(0,new_id.length()-1);
            }
        }

        if(new_id.length() <= 2) {
        	char c = new_id.charAt(new_id.length()-1);
        	sb.append(new_id);
        	for(int i=0; i<(3-new_id.length()); i++) {
        		sb.append(c);
        	}
        	
        	new_id = sb.toString();
        }

        answer = new_id;
        return answer;
    }
}