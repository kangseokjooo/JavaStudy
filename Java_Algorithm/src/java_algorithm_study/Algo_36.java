package java_algorithm_study;

import java.util.Scanner;

public class Algo_36 {
	public static void main(String arg[]) {
		Scanner s=new Scanner(System.in);
		
		int T=s.nextInt();
		
		while(T-->0) {
			int n=s.nextInt();
			
			int stock[]=new int[n];
			
			for(int i=0;i<n;i++) {
				stock[i]=s.nextInt();
			}
			
			int max=0;
			long profit=0;
			
			for(int i=n-1;i>=0;i--) {
				if(stock[i]>max) {
					max=stock[i];
				}else {
					profit+=max-stock[i];
				}
			}
			System.out.println(profit);
		}
	}
}
