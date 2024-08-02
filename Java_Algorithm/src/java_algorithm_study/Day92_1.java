package java_algorithm_study;

import java.util.Scanner;

public class Day92_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int T=s.nextInt();
		
		for(int t=0;t<T;t++) {
			int x1=s.nextInt();
			int y1=s.nextInt();
			int x2=s.nextInt();
			int y2=s.nextInt();
			
			int n=s.nextInt();
			
			int cnt=0;
			
			for(int i=0;i<n;i++) {
				int cx=s.nextInt();
				int cy=s.nextInt();
				int r=s.nextInt();
				boolean start=isPossible(x1,y1,cx,cy,r);
				boolean end=isPossible(x2,y2,cx,cy,r);
				if(start!=end) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
	static boolean isPossible(int px,int py,int cx,int cy,int r) {
		int dx=px-cx;
		int dy=py-cy;
		
		return dx*dx+dy*dy<r*r;
	}
	//BJ1004
}
