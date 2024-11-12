package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int C=s.nextInt();
		int R=s.nextInt();
		int K=s.nextInt();
		
		if(K>R*C) {
			System.out.println(0);
			return;
		}
		
		int [][]seats=new int[R][C];
		
		int dx[]= {0,1,0,-1};
		int dy[]= {1,0,-1,0};
		
		int x=0,y=0,dir=0;
		
		for(int i=1;i<=K;i++) {
			seats[y][x]=i;
			
			if(i==K) {
				System.out.println((x+1)+" "+(y+1));
				return;
			}
			int nx=x+dx[dir];
			int ny=y+dy[dir];
			
			if(nx<0||ny<0||nx>=C||ny>=R||seats[ny][nx]!=0) {
				dir=(dir+1)%4;
				nx=x+dx[dir];
				ny=y+dy[dir];
			}
			x=nx;
			y=ny;
			
		}
//		for (int i = 0; i <C; i++) {
//			for (int j = 0; j < R; j++) {
//				System.out.printf("%4d", seats[j][i]);  
//			}
//			System.out.println();
//		}
		
	}

}
