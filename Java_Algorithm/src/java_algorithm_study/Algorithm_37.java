package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_37 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int M=s.nextInt();
		
		boolean[][] incom=new boolean[N+1][N+1];
		
		for(int i=0;i<M;i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			incom[a][b]=true;
			incom[b][a]=true;
		}
		
		int cnt=0;
		
		for(int i=1;i<=N;i++) {
			for(int j=i+1;j<=N;j++) {
				for(int l=j+1;l<=N;l++) {
					if(!incom[i][j]&&!incom[i][l]&&!incom[j][l]) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
	//BJ2422
}
