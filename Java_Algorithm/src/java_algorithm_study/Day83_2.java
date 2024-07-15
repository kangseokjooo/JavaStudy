package java_algorithm_study;

import java.util.Scanner;

public class Day83_2 {
	static int R, C, K;
	static char[][] map;
	static boolean[][] visited;
	static int cnt = 0;
	static int dx[] = { 1, -1, 0, 0 };
	static int dy[] = { 0, 0, 1, -1 };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		R = s.nextInt();
		C = s.nextInt();
		K = s.nextInt();
		s.nextLine();

		map = new char[R][C];
		visited = new boolean[R][C];

		for (int i = 0; i < R; i++) {
			map[i] = s.nextLine().toCharArray();
		}

		visited[R - 1][0] = true;
		dfs(R - 1, 0, 1);

		System.out.println(cnt);
	}

	static void dfs(int x, int y, int dist) {
		if (x == 0 && y == C - 1) {
			if (dist == K) {
				cnt++;
			}
			return;
		}
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny] && map[nx][ny] == '.') {
				visited[nx][ny] = true;
				dfs(nx, ny, dist + 1);
				visited[nx][ny] = false;
			}
		}
	}
	//BJ1189
}
