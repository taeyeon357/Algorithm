import java.util.*;

public class Main {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine().toUpperCase();
		HashMap<Character, Integer> a = new HashMap<>();

		for (int i = 0; i < input.length(); i++) {
			if (a.containsKey(input.charAt(i))) {
				a.put(input.charAt(i), a.get(input.charAt(i)) + 1);
			} else {
				a.put(input.charAt(i), 1);
			}
		}
		
		Character maxKey = null;
		int maxValue = 0;
		int maxCnt = 0;
		for(Character k : a.keySet()) {
			if(a.get(k)>maxValue) {
				maxValue = a.get(k);
				maxKey = k;
				maxCnt = 1;
			}else if(a.get(k)==maxValue) {
				maxCnt += 1;
			}
		}
		
		if(maxCnt > 1) {
			System.out.println("?");
		}else {
			System.out.println(Character.toString(maxKey).toUpperCase());
		}
	}
}