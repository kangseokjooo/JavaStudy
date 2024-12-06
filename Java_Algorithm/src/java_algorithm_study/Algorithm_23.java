package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_23 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int R=s.nextInt();
		int C=s.nextInt();
		
		char [][]map=new char[R][C];
		char [][]fmap=new char[R][C];
		
		for(int i=0;i<R;i++) {
			String row=s.next();
			for(int j=0;j<C;j++) {
				map[i][j]=row.charAt(j);
				fmap[i][j]=map[i][j];
			}
		}
		int []dx= {-1,1,0,0};
		int []dy= {0,0,-1,1};
		
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(map[i][j]=='X') {
					int seacnt=0;
					for(int d=0;d<4;d++) {
						int nx=i+dx[d];
						int ny=j+dy[d];
						if(nx<0||ny<0||nx>=R||ny>=C||map[nx][ny]=='.') {
							seacnt++;
						}
					}
					if(seacnt>=3) {
						fmap[i][j]='.';
					}
				}
			}
		}
		
		int minR=R,maxR=0,minC=C,maxC=0;
		
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				if(fmap[i][j]=='X') {
					minR=Math.min(minR, i);
					maxR=Math.max(maxR, i);
					minC=Math.min(minC, j);
					maxC=Math.max(maxC, j);
				}
			}
		}
		for(int i=minR;i<=maxR;i++) {
			for(int j=minC;j<=maxC;j++) {
				System.out.print(fmap[i][j]);
			}
			System.out.println();
		}
	}
	//BJ5212
}
