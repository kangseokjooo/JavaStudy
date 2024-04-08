package java_algorithm_study;

import java.util.Scanner;

public class Day35_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		int buds[]=new int[N];
		int max=0;
		for(int i=0;i<N;i++) {
			buds[i]=s.nextInt();
			max=Math.max(max,buds[i]);
		}
		int total=s.nextInt();
		
		int l=0;
		int r=max;
		int result=0;
		
		while(l <= r) {
			int m=(l+r)/2;
			
			int sum=0;
			for(int b:buds) {
				sum+=Math.min(b, m);
			}
			if(sum<=total) {
				result=m;
				l=m+1;
			}else {
				r=m-1;
			}
		}
		System.out.println(result);
	}

}
