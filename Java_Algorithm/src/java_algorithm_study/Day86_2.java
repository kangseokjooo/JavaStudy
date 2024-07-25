package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day86_2 {
	static int n,m;
	static int[][]cheese;
	static boolean visited[][];
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		
		cheese=new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				cheese[i][j]=s.nextInt();
			}
		}
		int time=0;
		int lastCnt=0;
		
		while(true) {
			visited=new boolean[n][m];
			int curCnt=cntCheese();
			
			if(curCnt==0) {
				System.out.println(time);
				System.out.println(lastCnt);
				break;
			}
			lastCnt=curCnt;
			bfs();
			time++;
		}
	}
	static void bfs() {
		Queue<int []> q=new LinkedList<int[]>();
		q.offer(new int[] {0,0});
		visited[0][0]=true;
		
		while(!q.isEmpty()) {
			int []cur=q.poll();
			int x=cur[0];
			int y=cur[1];
			
			for(int i=0;i<4;i++) {
				int nx=x+dx[i];
				int ny=y+dy[i];
				
				if(nx>=0&&nx<n&&ny>=0&&ny<m&&!visited[nx][ny]) {
					visited[nx][ny]=true;
					if(cheese[nx][ny]==0) {
						q.offer(new int[] {nx,ny});
					}else if(cheese[nx][ny]==1) {
						cheese[nx][ny]=0;
					}
				}
			}
		}
	}
	static int cntCheese() {
		int cnt=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(cheese[i][j]==1) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	//BJ2646
}
