package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day58_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int telArr[]=new int[N];
		for(int i=0;i<N;i++) {
			telArr[i]=s.nextInt();
		}
		
		Arrays.sort(telArr);
		
		int dist[]=new int[N-1];
		for(int i=0;i<N-1;i++) {
			dist[i]=telArr[i+1]-telArr[i];
		}
		
		Arrays.sort(dist);
		
		int result=0;
		for(int i=0;i<N-K;i++) {
			result+=dist[i];
		}
		System.out.println(result);
	}
}
