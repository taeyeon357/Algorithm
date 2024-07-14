class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "b").replace("B", "a").toUpperCase(); 
        return myString.indexOf(pat) > -1 ? 1 : 0;
    }
}