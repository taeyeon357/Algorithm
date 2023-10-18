import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<String> queue = new ArrayList<>();
		int front = 0; //첫번째 원소 idx
		int back = 0; //마지막 원소 idx + 1
		
		int n = Integer.parseInt(bf.readLine());
		for(int i=0; i<n; i++) {
			String[] comm = bf.readLine().split(" ");
			
			if(comm[0].equals("push")) {
				queue.add(comm[1]);
				back += 1;
			}else if(comm[0].equals("pop")) {
				if(front == back) System.out.println(-1);
				else System.out.println(queue.get(front++));
			}else if(comm[0].equals("size")) {
				System.out.println(back - front);
			}else if(comm[0].equals("empty")) {
				if(back == front) System.out.println(1);
				else System.out.println(0);
			}else if(comm[0].equals("front")) {
				if(front == back) System.out.println(-1);
				else System.out.println(queue.get(front));
			}else if(comm[0].equals("back")) {
				if(front == back) System.out.println(-1);
				else System.out.println(queue.get(back-1));
			}
		}
	}
}
