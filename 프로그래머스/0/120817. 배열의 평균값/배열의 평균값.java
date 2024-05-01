import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        double answer = sum/(double)numbers.length;
        return answer;
    }
}