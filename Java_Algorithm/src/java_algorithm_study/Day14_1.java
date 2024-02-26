package java_algorithm_study;

import java.util.*;

public class Day14_1 {

	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
	       int N = s.nextInt();
	     
	        Map<Integer, List<String>> map = new HashMap<>();
	        
	        for (int i = 0; i < N; i++) {
	            int age = s.nextInt();
	            String name = s.next();
	           
	            map.putIfAbsent(age, new ArrayList<>());
	            map.get(age).add(name);
	        }
	        
	        Map<Integer, List<String>> sort = new TreeMap<>(map);
	        
	        for (Map.Entry<Integer, List<String>> entry : sort.entrySet()) {
	            int age = entry.getKey();
	            List<String> names = entry.getValue();
	            for (String name : names) {
	                System.out.println(age + " " + name);
	            }
	        }
		
	}

}
