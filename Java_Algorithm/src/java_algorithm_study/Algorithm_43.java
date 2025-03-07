package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_43 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int paper[][]=new int[100][100];
		
		int N=s.nextInt();
		
		for(int i=0;i<N;i++) {
			int x=s.nextInt();
			int y=s.nextInt();
			
			for(int dx=0;dx<10;dx++) {
				for(int dy=0;dy<10;dy++) {
					paper[x+dx][y+dy]=1;
				}
			}
		}
		int area=0;
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(paper[i][j]==1) {
					area++;
				}
			}
		}
		System.out.println(area);
	}
	//BJ2563
}
