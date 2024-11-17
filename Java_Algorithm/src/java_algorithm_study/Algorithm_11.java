package java_algorithm_study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Algorithm_11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		s.nextLine();
		
		for(int i=0;i<n;i++) {
			int T=s.nextInt();
			
			Map<Integer, Integer> aCnt=new HashMap<Integer, Integer>();
			
			for(int j=0;j<T;j++) {
				int an=s.nextInt();
				aCnt.put(an, aCnt.getOrDefault(an, 0)+1);
			}
			
			int k=T/2;
			int l=-1;
			for(Map.Entry<Integer, Integer> entry:aCnt.entrySet()) {
				if(entry.getValue()>k) {
					l=entry.getKey();
					break;
				}
			}
			if(l!=-1) {
				System.out.println(l);
			}else {
				System.out.println("SYJKGW");
			}
		}
	}

}
