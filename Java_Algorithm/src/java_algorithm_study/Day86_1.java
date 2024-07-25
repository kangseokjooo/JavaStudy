package java_algorithm_study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day86_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int L=s.nextInt();
		
		int p[][]=new int[N][2];
		
		for(int i=0;i<N;i++) {
			p[i][0]=s.nextInt();
			p[i][1]=s.nextInt();
		}
		Arrays.sort(p,Comparator.comparingInt(a->a[0]));
		
		int num=0;
		int cur=0;
		
		for(int[] x:p) {
			if(cur<x[0]) {
				cur=x[0];
			}
			while(cur<x[1]) {
				cur+=L;
				num++;
			}
		}
		System.out.println(num);
	}

}
