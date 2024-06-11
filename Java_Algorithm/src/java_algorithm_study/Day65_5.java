package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day65_5 {
	static int[][] map;
	static boolean[][] visited;
	static int M, N;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		M = s.nextInt();
		N = s.nextInt();
		s.nextLine();
		map = new int[M][N];
		visited = new boolean[M][N];
		for (int i = 0; i < M; i++) {
			String row = s.nextLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = row.charAt(j) - '0';
			}
		}
		boolean can = false;

		for (int i = 0; i < N; i++) {
			if (map[0][i] == 0 && !visited[0][i]) {
				if (bfs(0, i)) {
					can = true;
					break;
				}
			}
		}
		System.out.println(can ? "YES" : "NO");
	}

	static boolean bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { x, y });
		visited[x][y] = true;

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int cx = cur[0];
			int cy = cur[1];

			if (cx == M - 1) {
				return true;
			}
			for (int i = 0; i < 4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];

				if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && map[nx][ny] == 0) {
					visited[nx][ny] = true;
					q.offer(new int[] { nx, ny });
				}
			}
		}
		return false;
	}
}
