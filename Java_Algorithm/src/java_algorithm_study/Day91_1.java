package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day91_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int M=s.nextInt();
		int P[]=new int[M];
		
		for(int i=0;i<M;i++) {
			P[i]=s.nextInt();
		}
		Arrays.sort(P);
		
		int max=0;
		int price=0;
		
		for(int i=0;i<M;i++) {
			int p=P[i];
			int ecnt=Math.min(N, M-i);
			int profit=p*ecnt;
			
			if(profit>max) {
				max=profit;
				price=p;
			}
		}
		System.out.println(price+" "+max);
	}
	//BJ1246
}
