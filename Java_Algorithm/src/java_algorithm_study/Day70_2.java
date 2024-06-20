package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day70_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		
		int map[][]=new int[N][M];
		boolean visited[][]=new boolean[N][M];
		
		Queue<int []> q=new LinkedList<int[]>();
		
		int dx[]= {-1,-1,-1,0,0,1,1,1};
		int dy[]= {-1,0,1,-1,1,-1,0,1};
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				map[i][j]=s.nextInt();
				if(map[i][j]==1) {
					q.offer(new int [] {i,j});
					visited[i][j]=true;
				}
			}
		}
		int max=0;
		
		while(!q.isEmpty()) {
			int cur[]=q.poll();
			
			int x=cur[0];
			int y=cur[1];
			
			for(int i=0;i<8;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				
				if(nx>=0&&nx<N&&ny>=0&&ny<M&&!visited[nx][ny]) {
					visited[nx][ny]=true;
					map[nx][ny]=map[x][y]+1;
					max=Math.max(max, map[nx][ny]-1);
					q.offer(new int [] {nx,ny});
				}
			}
		}
		System.out.println(max);
	}

}
