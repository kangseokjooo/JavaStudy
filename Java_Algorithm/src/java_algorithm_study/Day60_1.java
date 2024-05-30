package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day60_1 {
	static int N,M,K;
	static int tower[][];
	static boolean visited[][];
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		M=s.nextInt();
		K=s.nextInt();
		tower=new int[N][M];
		visited=new boolean[N][M];
		
		for(int i=0;i<K;i++) {
			int r=s.nextInt()-1;
			int c=s.nextInt()-1;
			tower[r][c]=1;
		}
		int maxWas=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(tower[i][j]==1&&!visited[i][j]) {
					int foodWas=bfs(i,j);
					maxWas=Math.max(maxWas, foodWas);
				}
			}
		}
		System.out.println(maxWas);
	}
	static int bfs(int x,int y) {
		Queue<int []> q=new LinkedList<int[]>();
		q.offer(new int [] {x,y});
		visited[x][y]=true;
		int size=1;
		while(!q.isEmpty()) {
			int cur[]=q.poll();
			int cx=cur[0];
			int cy=cur[1];
			for(int i=0;i<4;i++) {
				int nx=cx+dx[i];
				int ny=cy+dy[i];
				if(isValid(nx,ny)) {
					q.offer(new int [] {nx,ny});
					visited[nx][ny]=true;
					size++;
				}
			}
		}
		return size;
	}
	static boolean isValid(int x, int y) {
		return x>=0 && y>=0 && x<N && y<M && !visited[x][y] && tower[x][y]==1;
	}
}
