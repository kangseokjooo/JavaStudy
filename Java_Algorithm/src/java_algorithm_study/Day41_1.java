package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day41_1 {
		static int map[][];
		static boolean visited[][];
		static int M,N;
		static int dy[]= {-1,1,0,0};
		static int dx[]= {0,0,-1,1};
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int i=0;i<T;i++) {
			 N=s.nextInt();
			 M=s.nextInt();
			int R=s.nextInt();
			map=new int [N][M];
			visited=new boolean[N][M];
			
			for(int j=0;j<R;j++) {
				int X=s.nextInt();
				int Y=s.nextInt();
				map[X][Y]=1;
			}
			int bugs=0;
			for(int k=0;k<N;k++) {
				for(int l=0;l<M;l++) {
					if(map[k][l]==1 && !visited[k][l]) {
						bfs(k,l);
						bugs++;
					}
				}
			}
			System.out.println(bugs);
		}
	}
	static void bfs(int y,int x) {
		Queue<int[]> q=new LinkedList<int[]>();
		q.offer(new int[] {y,x});
		visited[y][x]=true;
		
		while(!q.isEmpty()) {
			int current[]=q.poll();
			int cy=current[0];
			int cx=current[1];
			for(int i=0;i<4;i++) {
				
				int ny=cy+dy[i];
				
				int nx=cx+dx[i];
				
				if(ny>=0&& ny <N&&nx>=0&&nx<M&&map[ny][nx]==1 &&!visited[ny][nx]) {
					q.offer(new int[] {ny,nx});
					visited[ny][nx]=true;
				}
			}
		}
	}

}
