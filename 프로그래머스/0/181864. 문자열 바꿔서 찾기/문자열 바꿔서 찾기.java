class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "b");
        myString = myString.replace("B", "a");
        myString = myString.toUpperCase();
       
        return myString.indexOf(pat) > -1 ? 1 : 0;
    }
}