package java_algorithm_study;

import java.util.*;

public class Day20_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		Set<String> hear=new HashSet<>();
		Set<String> look=new HashSet<>();
		for (int i=0;i<N;i++) {
			hear.add(s.next());
		}
		for (int i=0;i<M;i++) {
			look.add(s.next());
		}
		List<String> inter=new ArrayList<>(hear);
		inter.retainAll(look);
		
		Collections.sort(inter);

		System.out.println(inter.size());
		for (String name:inter) {
			System.out.println(name);
		}
	}

}
