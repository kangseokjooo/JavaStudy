package java_algorithm_study;

import java.util.Scanner;

public class Day97_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int score[]=new int[N];
		
		for(int i=0;i<N;i++) {
			score[i]=s.nextInt();
		}
		int cnt=0;
		
		for(int i=N-2;i>=0;i--) {
			if(score[i]>=score[i+1]) {
				int diff=score[i]-score[i+1]+1;
				cnt+=diff;
				score[i]-=diff;
			}
		}
		System.out.println(cnt);
	}
	//BJ2847
}
