package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day89_2 {
	static int []dr= {-2,-2,0,0,2,2};
	static int []dc= {-1,1,-2,2,-1,1};
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		
		int r1=s.nextInt();
		int c1=s.nextInt();
		int r2=s.nextInt();
		int c2=s.nextInt();
		
		int result=bfs(N,r1,c1,r2,c2);
		
		System.out.println(result);
	}
	static int bfs(int N,int r1,int c1,int r2,int c2) {
		boolean [][]visited=new boolean[N][N];
		
		Queue<int []> q=new LinkedList<int[]>();
		q.offer(new int[] {r1,c1,0});
		visited[r1][c1]=true;
		
		while(!q.isEmpty()) {
			int []cur=q.poll();
			int cr=cur[0];
			int cc=cur[1];
			int step=cur[2];
			
			if(cr==r2&&cc==c2) {
				return step;
			}
			for(int i=0;i<6;i++) {
				int nr=cr+dr[i];
				int nc=cc+dc[i];
				
				if(nr>=0&&nr<N&&nc>=0&&nc<N&&!visited[nr][nc]) {
					visited[nr][nc]=true;
					q.offer(new int[] {nr,nc,step+1});
				}
			}
		}
		return -1;
	}
	//BJ16948
}
