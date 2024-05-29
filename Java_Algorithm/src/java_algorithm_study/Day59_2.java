package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day59_2 {
	static int map[][];
	static boolean visited[][];
	static int dx[]= {-1,1,0,0,-1,-1,1,1};
	static int dy[]= {0,0,-1,1,-1,1,-1,1};
	static int M,N;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		M=s.nextInt();
		N=s.nextInt();
		map=new int[M][N];
		visited=new boolean[M][N];
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				map[i][j]=s.nextInt();
			}
		}
		int wcnt=0;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j]==1 && !visited[i][j]) {
					bfs(i,j);
					wcnt++;
				}
			}
		}
		System.out.println(wcnt);

	}
	static void bfs(int x,int y) {
		Queue<int []> q=new LinkedList<int[]>();
		visited[x][y]=true;
		q.offer(new int [] {x,y});
		
		while(!q.isEmpty()) {
			int cur[]=q.poll();
			int cx=cur[0];
			int cy=cur[1];
			
			for(int i=0;i<8;i++) {
				int nx=cx+dx[i];
				int ny=cy+dy[i];
				if(isvalid(nx,ny)) {
					q.offer(new int[] {nx,ny});
					visited[nx][ny]=true;
				}
			}
		}
	}
	static boolean isvalid(int x,int y) {
		return x>=0 && y>=0 && x<M && y<N && !visited[x][y] && map[x][y]==1;
	}

}
