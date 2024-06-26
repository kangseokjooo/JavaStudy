package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day71_1 {
	static class Point{
		int x,y;
		Point(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		
		int [][]city=new int[M][N];
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				city[i][j]=s.nextInt();
			}
		}
		if(bfs(city,N,M)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
		public static boolean bfs(int[][] city, int N, int M) {

	        int[] dx = {1, 0}; 
	        int[] dy = {0, 1};

	        boolean[][] visited = new boolean[M][N];
	        Queue<Point> q = new LinkedList<>();
	        q.offer(new Point(0, 0));
	        visited[0][0] = true;

	        while (!q.isEmpty()) {
	            Point cur = q.poll();

	            if (cur.x == N - 1 && cur.y == M - 1) {
	                return true;
	            }


	            for (int i = 0; i < 2; i++) {
	                int nx = cur.x + dx[i];
	                int ny = cur.y + dy[i];

	                if (nx >= 0 && ny >= 0 && nx < N && ny < M && city[ny][nx] == 1 && !visited[ny][nx]) {
	                    q.offer(new Point(nx, ny));
	                    visited[ny][nx] = true;
	                }
	            }
	        }
	        return false;
	    }
	}


