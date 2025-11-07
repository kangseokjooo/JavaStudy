package codingTest;

import java.util.*;

public class T_32 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		
		char [][]candy=new char[N][N];
		int dx[]= {1,0};
		int dy[]= {0,1};
		int max=0;
		for(int i=0;i<N;i++) {
			String row=s.next();
			for(int j=0;j<N;j++) {
				candy[i][j]=row.charAt(j);
			}
		}
		
		for(int y=0;y<N;y++) {
			for(int x=0;x<N;x++) {
				for(int d=0;d<2;d++) {
					int nx=x+dx[d];
					int ny=y+dy[d];
					
					if(nx>=N || ny>=N) continue;
					
					if(candy[y][x]!=candy[ny][nx]) {
						swap(candy,x,y,nx,ny);
						max=Math.max(max, check(candy,N));
						swap(candy,x,y,nx,ny);
					}
				}
			}
		}
		System.out.println(max);
		
	}
	
	static void swap(char candy[][],int x,int y,int x1,int y1) {
		char tmp=candy[y][x];
		candy[y][x]=candy[y1][x1];
		candy[y1][x1]=tmp;
	}
	
	static int check(char candy[][],int N) {
		int max=1;
		for(int i=0;i<N;i++) {
			int rcnt=1,ccnt=1;
			for(int j=1;j<N;j++) {
				//행 
				if(candy[i][j]==candy[i][j-1]) rcnt++;
				else rcnt=1;
				max=Math.max(max, rcnt);
				//열 
				if(candy[j][i]==candy[j-1][i]) ccnt++;
				else ccnt=1;
				max=Math.max(max, ccnt);
			}
		}
		return max;
	}
	//BOJ S2 사탕게임 

}
