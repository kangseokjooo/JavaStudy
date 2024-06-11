package java_algorithm_study;

import java.util.Scanner;

public class Day65_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long N=s.nextLong();
		long M=s.nextLong();
		
		System.out.println(maxVis(N,M));
	}
	static long maxVis(long N,long M) {
		if(N==1) {
			return 1;
			
		}
		else if(N==2) {
			return Math.min(4, (M+1)/2);
		}else {
			if(M<7) {
				return Math.min(4, M);
			}else {
				return M-2;
			}
		}
	}
}
