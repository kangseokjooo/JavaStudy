package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;

public class asas {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int T=s.nextInt();
		
		while(T-- >0) {
			int N=s.nextInt();
			int P=s.nextInt();
			
			HashSet<Integer> cur=new HashSet<Integer>();
			
			cur.add(0);
			
			for(int i=1;i<=N;i++) {
				HashSet<Integer> n=new HashSet<Integer>();
				for(int f:cur) {
					n.add(f);
					if(f+i!=P) {
						n.add(f+i);
					}
				}
				cur=n;
			}
			int Max=Integer.MIN_VALUE;
			for(int f:cur) {
				Max=Math.max(Max, f);
			}
			System.out.println(Max);
		}
	}

}
