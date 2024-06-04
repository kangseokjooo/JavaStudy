package java_algorithm_study;

import java.util.Scanner;

public class Day63_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		
		for(int i=0;i<T;i++) {
			int x1=s.nextInt();
			int y1=s.nextInt();
			int r1=s.nextInt();
			int x2=s.nextInt();
			int y2=s.nextInt();
			int r2=s.nextInt();
			System.out.println(find(x1,y1,r1,x2,y2,r2));
		}
	}
	static int find(int x1, int y1, int r1, int x2, int y2, int r2) {
		int dist=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
		int rsum=(r1+r2)*(r1+r2);
		int rdiff=(r1-r2)*(r1-r2);
		
		if(dist==0&& r1==r2) {
			return -1;
		}else if(dist==rsum || dist ==rdiff) {
			return 1;
		}else if(rdiff<dist && dist<rsum) {
			return 2;
		}else {
			return 0;
		}
	}
}
