package java_algorithm_study;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	static int map[][];
	static boolean visited[][];
	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };
	static int N;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		map = new int[N][N];
		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			String row = s.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = row.charAt(j) - '0';
			}
		}
		int result=bfs();
		
		
		System.out.println(result);
	}

	static int bfs() {
		Queue<int []> q=new LinkedList<int[]>();
		q.offer(new int [] {0,0,0});
		visited[0][0]=true;
		int cnt=0;
		while(!q.isEmpty()) {
			int cur[]=q.poll();
			int curX=cur[0];
			int curY=cur[1];
			cnt=cur[2];
			for(int i=0;i<4;i++) {
				int nx=curX+dx[i];
				int ny=curY+dy[i];
				if(isvalid(nx,ny)&&!visited[nx][ny]&& map[nx][ny]==0) {
					q.offer(new int[] {nx,ny,cnt+1});
					visited[nx][ny]=true;
				}
				
			}
			if(visited[N-1][N-1]==true) {
				break;
			}
		}
		return cnt;
	}
	 static boolean isvalid(int x, int y) {
	        return x >= 0 && x < N && y >= 0 && y < N;
    }
	 static void print(boolean[][] v, int c ) {
		 for(boolean[] vv : v ) {
			 System.out.println(Arrays.toString(vv)); 
			 
		 }
		 System.out.println();
		 for(int i = 0 ; i < 10 ; i++)System.out.print(c+1);
		 System.out.println();
	 }
}
