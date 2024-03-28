package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day30_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int grade[]=new int[N];
		for(int i=0;i<N;i++) {
			grade[i]=s.nextInt();
		}
		Arrays.sort(grade);
		int dis=0;
		for(int i=0;i<N;i++) {
			dis+=Math.abs(grade[i]-(i+1));
		}
		System.out.println(dis);
	}

}
