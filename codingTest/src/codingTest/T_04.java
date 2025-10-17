package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class T_04 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		
		double score[]=new double[N];
		
		for(int i=0;i<N;i++) {
			score[i]=s.nextDouble();
		}
		
		Arrays.sort(score);
		double avg1=0;
		double avg2=0;
		
		for(int i=K;i<N-K;i++) {
			avg1+=score[i];
		}
		
		avg1/=(N-K*2);
		
		
		double min=score[K];
		double max=score[N-K-1];
		
		for(int i=0;i<N;i++) {
			if(i<K) avg2+=min;
			else if(i>=N-K) avg2+=max;
			else avg2+=score[i];
		}
		avg2/=N;
		
		System.out.printf("%.2f\n", avg1);
		System.out.printf("%.2f\n", avg2);
		
		
	}

}
//BOJ S3 절사평균 
