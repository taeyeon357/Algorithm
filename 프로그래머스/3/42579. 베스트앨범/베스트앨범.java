import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Integer> sumOfPlays = new HashMap<>();
        Map<String, List<Integer[]>> elements = new HashMap<>();
        for(int i=0; i<genres.length; i++) {
        	if(sumOfPlays.containsKey(genres[i])) {
        		sumOfPlays.put(genres[i], sumOfPlays.get(genres[i]) + plays[i]);
        	}else {
        		sumOfPlays.put(genres[i], plays[i]);
        	}
        	
        	if(elements.containsKey(genres[i])) {
        		List<Integer[]> el = new ArrayList<>(elements.get(genres[i]));
        		el.add(new Integer[] {plays[i], i});
        		
        		elements.put(genres[i], el);
        	}else {
        		List<Integer[]> el = new ArrayList<>();
        		el.add(new Integer[] {plays[i], i});	
        		
        		elements.put(genres[i], el);
        	}
        }
        
        List<String> orderOfGen = new ArrayList<>(sumOfPlays.keySet());
        Collections.sort(orderOfGen, (o1, o2) -> (sumOfPlays.get(o2) - sumOfPlays.get(o1)));
        
        List<Integer> resultList = new ArrayList<>();
        
        for(int i=0; i<orderOfGen.size(); i++) {
        	List<Integer[]> el = new ArrayList<>(elements.get(orderOfGen.get(i)));
        	Collections.sort(el, new Comparator<Integer[]>() {
        		@Override
        		public int compare(Integer[] o1, Integer[] o2) {
        			if(o1[0] == o2[0]) {
        				return o1[1] - o2[1];
        			}
        			return o2[0] - o1[0];
        		}
        	});
        	
        	resultList.add(el.get(0)[1]);
        	if(el.size() >= 2) {
        		resultList.add(el.get(1)[1]);
        	}
        }

        answer = resultList.stream().mapToInt(a->a).toArray();
        return answer;
    }
}