import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			Stack<Character> stk = new Stack<>();
			String str = sc.nextLine();
			for(int j=0; j<str.length(); j++) {
				if(stk.empty()) {
					stk.add(str.charAt(j));
				}else {
					if(str.charAt(j)==')' && stk.peek()=='(') {
						stk.pop();
					}else {
						stk.add(str.charAt(j));
					}
				}
			}
			if(stk.size()==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}

	}

}