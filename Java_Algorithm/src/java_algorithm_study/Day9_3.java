package java_algorithm_study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Day9_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int A[]=new int[N];
		Integer B[]=new Integer[N];
		for(int i=0;i<N;i++) {
			A[i]=s.nextInt();
		}
		for(int i=0;i<N;i++) {
			B[i]=s.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B,Collections.reverseOrder());
		long sum=0;
		for(int i=0;i<N;i++) {
			sum+=A[i] * B[i];
		}
		System.out.println(sum);
	}
//solved
}
