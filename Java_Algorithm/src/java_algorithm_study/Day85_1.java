package java_algorithm_study;

import java.util.Scanner;

public class Day85_1 {
	static int N,M;
	static char[][] floor;
	static boolean visited[][];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		N=s.nextInt();
		M=s.nextInt();
		s.nextLine();
		
		floor=new char[N][M];
		visited=new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			floor[i]=s.nextLine().toCharArray();
		}
		int cnt=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(!visited[i][j]) {
					dfs(i,j,floor[i][j]);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	static void dfs(int x,int y,char type) {
		if(x<0||x>=N||y<0||y>=M||visited[x][y]||floor[x][y]!=type) {
			return;
		}
		visited[x][y]=true;
		
		if(type=='-') {
			dfs(x,y+1,type);
		}else if(type=='|') {
			dfs(x+1,y,type);
		}
	}
	//BJ1388
}
