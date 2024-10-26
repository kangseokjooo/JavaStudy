package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;

public class Algorithm_01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int T=s.nextInt();
		
		for(int t=0;t<T;t++) {
			int N=s.nextInt();
			HashSet<Integer> n1=new HashSet<Integer>();
			
			for(int i=0;i<N;i++) {
				n1.add(s.nextInt());
			}
			int M=s.nextInt();
			
			StringBuilder sb=new StringBuilder();
			
			for(int i=0;i<M;i++) {
				int num=s.nextInt();
				if(n1.contains(num)) {
					sb.append("1\n");
					
				}else {
					sb.append("0\n");
				}
			}
			System.out.println(sb.toString().trim());
		}
		
	}

}
