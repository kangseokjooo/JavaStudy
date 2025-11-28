package codingTest;

import java.util.*;

public class T_93 {
	static int N,M;
	static int map[][];
	static int max=0;
	
	static int dx[]= {0,0,-1,1};
	static int dy[]= {1,-1,0,0};

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		N=s.nextInt();
		M=s.nextInt();
		
		map=new int[N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				map[i][j]=s.nextInt();
			}
		}
		make(0);
		System.out.println(max);
	}
	
	static void bfs() {
		Queue<int []> q=new LinkedList<int[]>();
		int t[][]=new int[N][M];
		
		for(int i=0;i<N;i++) {
			t[i]=map[i].clone();
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(t[i][j]==2) {
					q.add(new int[] {i,j});
				}
			}
		}
		while(!q.isEmpty()) {
			int cur[]=q.poll();
			for(int i=0;i<4;i++) {
				int nx=cur[0]+dx[i];
				int ny=cur[1]+dy[i];
				
				if(nx<0||ny<0||nx>=N||ny>=M) continue;
				
				if(t[nx][ny]==0) {
					t[nx][ny]=2;
					q.add(new int[] {nx,ny});
				}
			}
		}
		
		int safe=0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(t[i][j]==0) {
					safe++;
				}
			}
		}
		max=Math.max(max, safe);
	}
	//빈칸이있으면 0->1로 벽 세우기 벽을3개 세웠으면 탐색  
	static void make(int count) {
		if(count==3) {
			bfs();
			return;
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j]==0) {
					map[i][j]=1;
					make(count+1);
					map[i][j]=0;
				}
			}
		}
		
	}
	
	//연구소 G4 BOJ

}
