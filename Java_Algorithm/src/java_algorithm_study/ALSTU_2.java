package java_algorithm_study;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ALSTU_2 {
	static int N, M;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0, -1, -1, 1, 1 };
	static int[] dy = { 0, 0, -1, 1, -1, 1, -1, 1 };

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while (T-- > 0) {
			N = s.nextInt();
			M = s.nextInt();
			map = new int[N][M];
			visited = new boolean[N][M];
			HashSet<Integer> dup = new HashSet<Integer>();

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					map[i][j] = s.nextInt();
				}
			}
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(map[i][j]!=-1&&!visited[i][j]) {
						if(sameTeam(i,j)) {
							dup.add(map[i][j]);
						}
						bfs(i,j);
					}
				}
			}
			System.out.println(dup.size());
		}
	}
	static boolean sameTeam(int x,int y) {
		int team=map[x][y];
		for(int d=0;d<8;d++) {
			int nx=x+dx[d];
			int ny=y+dy[d];
			
			if(isValid(nx,ny)&&map[nx][ny]==team) {
				return true;
			}
		}
		return false;
	}
    static boolean isValid(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
    static void bfs(int x,int y) {
    	Queue<int []> q=new LinkedList<int[]>();
    	q.add(new int[] {x,y});
    	visited[x][y]=true;
    	int team=map[x][y];
    	
    	while(!q.isEmpty()) {
    		int pos[]=q.poll();
    		int cx=pos[0],cy=pos[1];
    		
    		for(int d=0;d<8;d++) {
    			int nx=cx+dx[d];
    			int ny=cy+dy[d];
    			
    			if(isValid(nx, ny)&& !visited[nx][ny] && map[nx][ny]==team) {
    				visited[nx][ny]=true;
    				q.add(new int[] {nx,ny});
    			}
    		}
    	}
    }
    //BJ9555
}
