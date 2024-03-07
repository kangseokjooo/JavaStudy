package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day20_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<=N;i++) {
			sb.append(i);
		}
		String str=sb.toString();
		String[] c=str.split("");
		
		System.out.println(c[K-1]);
	}

}
