package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day47_2 {
	static int R, C;
	static char[][] yard;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		R = s.nextInt();
		C = s.nextInt();
		s.nextLine();
		yard = new char[R][C];
		visited = new boolean[R][C];

		for (int i = 0; i < R; i++) {
			String row = s.nextLine();
			for (int j = 0; j < C; j++) {
				yard[i][j] = row.charAt(j);
			}
		}

		int sCount = 0;
		int wCount = 0;

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (!visited[i][j] && yard[i][j] != '#') {
					int[] count = bfs(i, j);
					sCount += count[0];
					wCount += count[1];
				}
			}
		}

		System.out.println(sCount + " " +wCount);
	}

	static int[] bfs(int x, int y) {
		int[] count = new int[2];
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] { x, y });
		visited[x][y] = true;

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int curX = cur[0];
			int curY = cur[1];

			if (yard[curX][curY] == 'o') {
				count[0]++;
			} else if (yard[curX][curY] == 'v') {
				count[1]++;
			}

			for (int i = 0; i < 4; i++) {
				int nx = curX + dx[i];
				int ny = curY + dy[i];

				if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny] && yard[nx][ny] != '#') {
					q.offer(new int[] { nx, ny });
					visited[nx][ny] = true;
				}
			}
		}
		if (count[0] > count[1]) {
			count[1] = 0;
		}
		else {
			count[0] = 0;
		}

		return count;
	}
}
