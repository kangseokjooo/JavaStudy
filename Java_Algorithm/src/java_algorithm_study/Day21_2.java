package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day21_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int sum=0;
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<N;i++) {
			sum+=arr[i]*(N-i);
		}
		System.out.println(sum);
	}

}
