package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day80_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int M = s.nextInt();
		int N = s.nextInt();

		int[][] grid = new int[M][N];

		for (int i = 0; i < M; i++) {
			String line = s.next();
			for (int j = 0; j < N; j++) {
				grid[i][j] = line.charAt(j) - '0';
			}
		}
		boolean result = bfs(grid, M, N);
		System.out.println(result ? "YES" : "NO");
	}

	static boolean bfs(int grid[][], int M, int N) {
		int dx[] = { 1, -1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };

		Queue<int[]> q = new LinkedList<int[]>();
		boolean visited[][] = new boolean[M][N];

		for (int j = 0; j < N; j++) {
			if (grid[0][j] == 0) {
				q.offer(new int[] { 0, j });
				visited[0][j] = true;
			}
		}
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0];
			int y = cur[1];

			if (x == M - 1) {
				return true;
			}

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < M && ny >= 0 && ny < N && grid[nx][ny] == 0 && !visited[nx][ny]) {
					q.add(new int[] { nx, ny });
					visited[nx][ny] = true;
				}
			}
		}

		return false;
	}
	//BJ13565
}
