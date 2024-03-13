package java_algorithm_study;

import java.util.*;

public class Day21_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int A=s.nextInt();
		int B= s.nextInt();
		Set<Integer> Alist=new HashSet<Integer>();
		Set<Integer> Blist=new HashSet<Integer>();
		for(int i=0;i<A;i++) {
			Alist.add(s.nextInt());
		}
		for(int i=0;i<B;i++) {
			Blist.add(s.nextInt());
		}
		int result=0;
		for(int num :Alist) {
			if(!Blist.contains(num)) {
				result++;
			}
		}
		for(int num :Blist) {
			if(!Alist.contains(num)) {
				result++;
			}
		}
		System.out.println(result);
	}

}
