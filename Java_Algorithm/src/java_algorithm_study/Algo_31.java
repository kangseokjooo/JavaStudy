package java_algorithm_study;

import java.util.*;

public class Algo_31 {

	static int w, h;
	static int[][] map;
	static boolean[][] visited;
	
	//상하좌우 대각선 
	static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};    
	static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			w = s.nextInt();
			h = s.nextInt();

			if (w == 0 && h == 0)
				break;

			map = new int[h][w];
			visited = new boolean[h][w];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = s.nextInt();
				}
			}

			int cnt = 0;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1 && !visited[i][j]) {
						dfs(i, j);
						cnt++;
					}
				}
			}

			System.out.println(cnt);
		}
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < h && ny >= 0 && ny < w) {
				if (map[nx][ny] == 1 && !visited[nx][ny]) {
					dfs(nx, ny);
				}
			}
		}
	}
	//BJ3098
}
