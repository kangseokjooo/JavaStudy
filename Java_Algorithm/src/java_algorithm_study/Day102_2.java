package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day102_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		int [][]board=new int[N][N];
		boolean [][]visited=new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				board[i][j]=s.nextInt();
			}
		}
		Queue<int []> q=new LinkedList<int[]>();
		
		q.offer(new int[] {0,0});
		visited[0][0]=true;
		
		int []dx= {0,1};
		int []dy= {1,0};
		
		while(!q.isEmpty()) {
			int cur[]=q.poll();
			int x=cur[0];
			int y=cur[1];
			int move=board[x][y];
			
			if(move==-1) {
				System.out.println("HaruHaru");
				return;
			}
			for(int i=0;i<2;i++) {
				int nx=x+dx[i]*move;
				int ny=y+dy[i]*move;
				
				if(nx>=0&&ny>=0&&nx<N&&ny<N&&!visited[nx][ny]) {
					q.offer(new int[] {nx,ny});
					visited[nx][ny]=true;
				}
			}
		}
		System.out.println("Hing");
	}
//BJ16174
}
