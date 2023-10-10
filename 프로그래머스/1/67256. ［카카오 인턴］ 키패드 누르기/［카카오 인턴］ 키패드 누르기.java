class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[][] dist = { 
                { 0, 4, 3, 4, 3, 2, 3, 2, 1, 2, 1, 1 }, // 0에서 j번까지의 거리
				{ 4, 0, 1, 2, 1, 2, 3, 2, 3, 4, 3, 5 }, // 1
				{ 3, 1, 0, 1, 2, 1, 2, 3, 2, 3, 4, 4 }, // 2
				{ 4, 2, 1, 0, 3, 2, 1, 4, 3, 2, 5, 3 }, // 3
				{ 3, 1, 2, 3, 0, 1, 2, 1, 2, 3, 2, 4 }, // 4
				{ 2, 2, 1, 2, 1, 0, 1, 2, 1, 2, 3, 3 }, // 5
				{ 3, 3, 2, 1, 2, 1, 0, 3, 2, 1, 4, 2 }, // 6
				{ 2, 2, 3, 4, 1, 2, 3, 0, 1, 2, 1, 3 }, // 7
				{ 1, 3, 2, 3, 2, 1, 2, 1, 0, 1, 2, 2 }, // 8
				{ 2, 4, 3, 2, 3, 2, 1, 2, 1, 0, 3, 1 }, // 9
				{ 1, 3, 4, 5, 2, 3, 4, 1, 2, 3, 0, 2 }, // *
				{ 1, 5, 4, 3, 4, 3, 2, 3, 2, 1, 2, 0 } // #
		};

		int nowL = 10;
		int nowR = 11;
		for (int i : numbers) {
			int distFromL = dist[nowL][i];
			int distFromR = dist[nowR][i];

			if (i == 1 | i == 4 | i == 7) {
				nowL = i;
				answer += "L";
			} else if (i == 3 | i == 6 | i == 9) {
				nowR = i;
				answer += "R";
			} else if (distFromL == distFromR) {
				if (hand.equals("left")) {
					nowL = i;
					answer += "L";
				} else {
					nowR = i;
					answer += "R";
				}
			} else if(distFromL > distFromR) {
				nowR = i;
				answer += "R";		
			} else {
				nowL = i;
				answer += "L";				
			}
		}
        
        return answer;
    }
}