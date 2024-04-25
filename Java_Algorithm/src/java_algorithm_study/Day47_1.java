package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day47_1 {
	static int N,M;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx= {-1,1,0,0};
	static int []dy= {0,0,-1,1};
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		M=s.nextInt();
		
		map=new int[N][M];
		visited=new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String row=s.next();
			for(int j=0;j<M;j++) {
				map[i][j]=row.charAt(j)-'0';
			}
		}
		System.out.println(bfs(0,0));
	}
	static int bfs(int x,int y) {
		Queue<int[]> q=new LinkedList<int[]>();
		q.offer(new int[] {x,y,1});
		
		while(!q.isEmpty()) {
			int cur[]=q.poll();
			int curX=cur[0];
			int curY=cur[1];
			int cnt=cur[2];
			
			if(curX==N-1 && curY==M-1) {
				return cnt;
			}
			
			for(int i=0;i<4;i++) {
				int nx=curX+dx[i];
				int ny=curY+dy[i];
				
				if(nx<0||nx>=N|| ny<0||ny>=M ||map[nx][ny]==0||visited[nx][ny]) {
					continue;
				}
				visited[nx][ny]=true;
				q.offer(new int [] {nx,ny,cnt+1});
			}
		}
		return -1;
	}
}
