class Solution {
    public String solution(String my_string, String alp) {
        if(Character.isLowerCase(alp.charAt(0))) return my_string.replace(alp, alp.toUpperCase());
        else return my_string.replace(alp, alp.toLowerCase());
    }
}