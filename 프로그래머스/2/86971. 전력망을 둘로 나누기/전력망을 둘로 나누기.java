import java.util.*; 

class Solution {
    static boolean visited[];
	static int countVal = 0;
	    
    public static int solution(int n, int[][] wires) {
        int answer = n;
        Boolean visited[];
        Map<Integer, Set<Integer>> conn = new HashMap<>();
        Stack<Integer> stk = new Stack<>(); 
        
        for(int i=0; i<wires.length; i++) {//i번째 와이어 끊기
        	conn.clear();
        	for(int j=0; j<wires.length; j++) {
        		if(i!=j) {
        			if(conn.keySet().contains(wires[j][0])) {
        				Set<Integer> set = new HashSet<>(conn.get(wires[j][0]));
        				set.add(wires[j][1]);
        				conn.put(wires[j][0], set);
        			}else {
        				Set<Integer> set = new HashSet<>();
        				set.add(wires[j][1]);
        				conn.put(wires[j][0], set);
        			}
        			if(conn.keySet().contains(wires[j][1])) {
        				Set<Integer> set = new HashSet<>(conn.get(wires[j][1]));
        				set.add(wires[j][0]);
        				conn.put(wires[j][1], set);
        			}else {
        				Set<Integer> set = new HashSet<>();
        				set.add(wires[j][0]);
        				conn.put(wires[j][1], set);
        			}
        		}
        		
        	}
        	
        	visited = new Boolean[n+1];
        	Arrays.fill(visited, false);
        	stk.add(wires[i][0]);
        	visited[wires[i][0]] = true;
        	while(!stk.empty()) {
        		if(conn.containsKey(stk.peek())) {
	        		for(int e : conn.get(stk.pop())) {
	        			if(!visited[e]) {
	        				stk.add(e);
	        				visited[e] = true;
	        			}
	        		}
        		}else {
        			stk.pop();
        		}
        	}
        	List<Boolean> tempList = new ArrayList<Boolean>(Arrays.asList(visited));
        	int c1 = Collections.frequency(Arrays.asList(visited), true);
        	System.out.println(c1);
        	
        	
        	visited = new Boolean[n+1];
        	Arrays.fill(visited, false);
        	stk.add(wires[i][1]);
        	visited[wires[i][1]] = true;
        	while(!stk.empty()) {
        		if(conn.containsKey(stk.peek())) {
	        		for(int e : conn.get(stk.pop())) {
	        			if(!visited[e]) {
	        				stk.add(e);
	        				visited[e] = true;
	        			}
	        		}
        		}else {
        			stk.pop();
        		}
        	}
        	tempList = new ArrayList<Boolean>(Arrays.asList(visited));
        	int c2 = Collections.frequency(tempList, true);
        	System.out.println(c2);
        	
        	answer = Math.min(answer, Math.abs(c1-c2));
        }
        
        return answer;
   
    }
    
}