import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class Main {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		List<String> result = new ArrayList<>();
		
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(sc.nextLine()));
		}
		
		int listIdx = 0;
		for(int i=1; i<=n; i++) {
			stk.add(i);
			result.add("+");
			while(listIdx<n&&!stk.empty()&&stk.peek().equals(list.get(listIdx))) {
				stk.pop();
				result.add("-");
				listIdx ++;
			}
		}
		
		
		if(stk.empty()) {
			for(int i=0; i<result.size(); i++) {
				System.out.println(result.get(i));
			}	
		}else {
			System.out.println("NO");
		}
	}

}