package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Algo_40 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int M=s.nextInt();
		s.nextLine();
		
		Set<String> memo=new HashSet<String>();
		
		for(int i=0;i<N;i++) {
			memo.add(s.nextLine());
		}
		
		for(int i=0;i<M;i++) {
			String []words=s.nextLine().split(",");
			
			for(String k:words) {
				memo.remove(k);
			}
			System.out.println(memo.size());
			
		}
		
	}
		//BJ22233
}
