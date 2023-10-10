import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

		HashMap<String, Integer> scoreMap = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			scoreMap.put(name[i], yearning[i]);
		}

		int sum = 0;
		for (int i = 0; i < photo.length; i++) {
			sum = 0;
			for (String p : photo[i]) {
				if (scoreMap.keySet().contains(p)) {
					sum += scoreMap.get(p);
				}
			}
			answer[i] = sum;
		}
        return answer;
    }
}