package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day79_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		int position[]=new int[N];
		
		for(int i=0;i<N;i++) {
			position[i]=s.nextInt();
		}
		System.out.println(minStep(position,N,M));
	}
	static int minStep(int []position,int N ,int M) {
		Arrays.sort(position);
		
		int total=0;
		int maxDist=0;
		
		for(int i=0;i<N;i++) {
			if(position[i]<0) {
				int step=0;
				for(int j=0;j<M && i+j<N && position[i+j]<0;j++) {
					step=Math.max(step, -position[i+j]);
				}
				total+=step*2;
				maxDist=Math.max(maxDist, step);
				i+=M-1;
			}
		}
		for(int i=N-1;i>=0;i--) {
			if(position[i]>0) {
				int step=0;
				for(int j=0;j<M&&i-j>=0&&position[i-j]>0;j++) {
					step=Math.max(step, position[i-j]);
					
				}
				total+=step*2;
				maxDist=Math.max(maxDist, step);
				i-=M-1;
			}
		}
		total-=maxDist;
		return total;
	}
	//BJ1461
}
