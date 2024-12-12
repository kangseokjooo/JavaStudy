package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algorithm_26 {
	static int n,m;
	static char[][] campus;
	static boolean[][] visited;
	static int []dx= {-1,1,0,0};
	static int []dy= {0,0,-1,1};
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		n=s.nextInt();
		m=s.nextInt();
		s.nextLine();
		
		campus=new char[n][m];
		visited=new boolean[n][m];
		
		int sx=0,sy=0;
		
		for(int i=0;i<n;i++) {
			String row=s.nextLine();
			for(int j=0;j<m;j++) {
				campus[i][j]=row.charAt(j);
				if(campus[i][j]=='I') {
					sx=i;
					sy=j;
				}
			}
		}
		int result=bfs(sx,sy);
		
		if(result==0) {
			System.out.println("TT");
		}else {
			System.out.println(result);
		}
	}
	static int bfs(int x,int y) {
		Queue<int[]> q=new LinkedList<int[]>();
		q.offer(new int[] {x,y});
		visited[x][y]=true;
		
		int cnt=0;
		
		while(!q.isEmpty()) {
			int []cur=q.poll();
			int cx=cur[0];
			int cy=cur[1];
			
			for(int i=0;i<4;i++) {
				int nx=cx+dx[i];
				int ny=cy+dy[i];
				
				if(nx<0||ny<0||nx>=n||ny>=m||visited[nx][ny]||campus[nx][ny]=='X') {
					continue;
				}
				visited[nx][ny]=true;
				
				if(campus[nx][ny]=='P') {
					cnt++;
				}
				q.offer(new int[] {nx,ny});
			}
		}
		return cnt;
	}
	//BJ21736
}
