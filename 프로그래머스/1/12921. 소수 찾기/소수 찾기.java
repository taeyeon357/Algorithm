class Solution {
    public int solution(int n) {
		int answer = 2;

		boolean isPrime = true;
		if (n < 4) {
			answer = n-1;
		} else {
			for (int i = 4; i <= n; i++) {
				for (int div = 2; div <= Math.sqrt((double)i); div++) {
					if (i % div == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime)
					answer += 1;
				isPrime = true;

			}
		}
        return answer;
    }
}