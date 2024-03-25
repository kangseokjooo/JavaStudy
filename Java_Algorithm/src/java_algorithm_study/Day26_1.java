package java_algorithm_study;

import java.util.Scanner;

public class Day26_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		int bag=Integer.MAX_VALUE;
		for(int i=0;i<=N/5;i++) {
			int re=N-(5*i);
			if(re%3==0) {
				bag=Math.min(bag, i+re/3);
			}
		}
		if(bag==Integer.MAX_VALUE) {
			System.out.println("-1");
		}else {
			System.out.println(bag);
		}
	}

}
