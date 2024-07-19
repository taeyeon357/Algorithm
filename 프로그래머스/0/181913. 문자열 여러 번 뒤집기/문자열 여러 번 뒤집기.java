class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        String tmp;
        for(int[] q : queries){
            tmp = my_string.substring(q[0], q[1]+1);
            for(int i=q[0]; i<=q[1]; i++){
                arr[i] = tmp.charAt(tmp.length() + q[0] - i - 1);
            }
            my_string = new String(arr);
        }
        return new String(arr);
    }
}