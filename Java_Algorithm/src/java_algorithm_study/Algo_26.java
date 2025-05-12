package java_algorithm_study;

import java.util.Scanner;

public class Algo_26 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []score=new int[n];
		
		for(int i=0;i<n;i++) {
			score[i]=s.nextInt();
			
		}
		int dp[]=new int[n];
		
		if(n==1) {
			System.out.println(score[0]);
			return;
		}else if(n==2) {
			System.out.println(score[0]+score[1]);
			return;
		}
		
		dp[0]=score[0];
		dp[1]=score[0]+score[1];
		dp[2]=Math.max(score[0]+score[2], score[1]+score[2]);
		
		for(int i=3;i<n;i++) {
			dp[i]=Math.max(dp[i-2], dp[i-3]+score[i-1])+score[i];
		}
		System.out.println(dp[n-1]);
	}
	//BJ2579(O)
}
