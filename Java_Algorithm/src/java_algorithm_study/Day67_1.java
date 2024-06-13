package java_algorithm_study;

import java.util.Scanner;

public class Day67_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		s.nextLine();
		int rect[][]=new int[N][M];
		
		for(int i=0;i<N;i++) {
			String row=s.nextLine();
			for(int j=0;j<M;j++) {
				rect[i][j]=row.charAt(j)-'0';
			}
		}
		
		int max=1;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				for(int k=1;i+k<N&&j+k<M;k++) {
					if(rect[i][j] == rect[i][j + k] && rect[i][j] == rect[i + k][j] && rect[i][j] == rect[i + k][j + k]) {
						max=Math.max(max, (k+1)*(k+1));
					}
				}
			}
		}
		System.out.println(max);
	}

}
