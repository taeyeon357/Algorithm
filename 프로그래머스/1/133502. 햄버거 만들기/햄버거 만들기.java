class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ingredient.length; i++) {
			sb.append(ingredient[i]);

			int len = sb.length();
			if (len > 3 && sb.subSequence(len - 4, len).equals("1231")) {
				answer += 1;
				sb.delete(len - 4, len);
			}

		}

        return answer;
    }
}