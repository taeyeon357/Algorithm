class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        
        int p = 0;
        int y = 0;
        
        for(int i =0; i<s.length(); i++) {
			if (s.charAt(i) == 'p'){
				p += 1;
			} else if(s.charAt(i)=='y') {
				y += 1;
			}
		}
        if (p==y){
            return true;
        } 
        return false;
    }
}