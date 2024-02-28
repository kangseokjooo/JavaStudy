package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day16_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int S[]=new int[N];
		for(int i=0;i<N;i++) {
			S[i]=s.nextInt();
		}
		int M=s.nextInt();
		int []card=new int[M];
		for(int i=0;i<M;i++) {
			card[i]=s.nextInt();
		}
		Arrays.sort(S);
		int result[]=new int[M];
		for(int i=0;i<M;i++) {
			if(Arrays.binarySearch(S, card[i]) >=0) {
				result[i]=1;
			}else {
				result[i]=0;
			}
		}
		for(int num: result) {
			System.out.print(num+" ");
		}
	}

}
