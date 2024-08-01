package java_algorithm_study;

import java.util.Scanner;

public class Day91_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int M=s.nextInt();
		int []J=new int[M];
		long l=1;
		long r=0;
		
		for(int i=0;i<M;i++) {
			J[i]=s.nextInt();
			if(r<J[i]) {
				r=J[i];
			}
		}
		long result=r;
		
		while(l<=r) {
			long m=(l+r)/2;
			
			if(isPossible(J,N,m)) {
				result=m;
				r=m-1;
			}else {
				l=m+1;
			}
		}
		System.out.println(result);
		
	}
	static boolean isPossible(int []J,int N,long max) {
		long student=0;
		
		for(int j:J) {
			student +=(j+max-1)/max;
			if(student>N) {
				return false;
			}
		}
		return student<=N;
	}
	//BJ2792
}
