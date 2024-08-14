package java_algorithm_study;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Day99_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		Map<String, Integer> tm=new TreeMap<String, Integer>();
		
		int total=0;
		
		while(s.hasNextLine()) {
			String tree=s.nextLine().trim();
			if(tree.isEmpty()) {
				break;
			}
			tm.put(tree, tm.getOrDefault(tree, 0)+1);
			total++;
		}
		for(Map.Entry<String, Integer> en:tm.entrySet()) {
			String tree=en.getKey();
			int cnt=en.getValue();
			double percent=(cnt*100.0)/total;
			System.out.printf("%s %.4f%n",tree,percent);
		}
		
	}
	//BJ4358

}
