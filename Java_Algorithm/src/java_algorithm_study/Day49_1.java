package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day49_1 {
	static int map[][];
	static boolean visited[][];
	static int w,h;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; 
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		while(true) {
			w=s.nextInt();
			h=s.nextInt();
			
			if(w==0&&h==0) break;
			
			map=new int[h][w];
			visited=new boolean[h][w];
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					map[i][j]=s.nextInt();
				}
			}
			int cnt=0;
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(map[i][j]==1 && !visited[i][j]) {
						bfs(i,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	static void bfs(int x,int y) {
		Queue<int[]> q=new LinkedList<int[]>();
		q.offer(new int [] {x,y});
		visited[x][y]=true;
		
		while(!q.isEmpty()) {
			int cur[]=q.poll();
			int cx=cur[0];
			int cy=cur[1];
			
			for(int i=0;i<8;i++) {
				 int nx = cx + dx[i];
	                int ny = cy + dy[i];

	                if (nx >= 0 && nx < h && ny >= 0 && ny < w && map[nx][ny] == 1 && !visited[nx][ny]) {
	                    q.offer(new int[]{nx, ny});
	                    visited[nx][ny] = true;
	                }
			}
		}
	}

}
