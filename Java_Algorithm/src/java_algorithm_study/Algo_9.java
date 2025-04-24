package java_algorithm_study;

import java.util.Scanner;

public class Algo_9 {
	static int R, C;
	static char map[][];
	static boolean visited[][];

	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };

	static int sheepcnt;
	static int wolfcnt;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		R = s.nextInt();
		C = s.nextInt();
		s.nextLine();

		map = new char[R][C];
		visited = new boolean[R][C];

		for (int i = 0; i < R; i++) {
			map[i] = s.nextLine().toCharArray();
		}

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (!visited[i][j] && map[i][j] != '#') {
					int result[] = dfs(i, j);
					int sheep = result[0];
					int wolf = result[1];

					if (sheep > wolf) {
						sheepcnt += sheep;
					} else {
						wolfcnt += wolf;
					}
				}
			}
		}
		System.out.println(sheepcnt + " " + wolfcnt);
	}

	static int[] dfs(int x, int y) {
		visited[x][y] = true;
		int sheep = 0;
		int wolf = 0;

		if (map[x][y] == 'k')
			sheep++;
		else if (map[x][y] == 'v')
			wolf++;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < R && ny < C) {
				if (!visited[nx][ny] && map[nx][ny] != '#') {
					int res[] = dfs(nx, ny);
					sheep += res[0];
					wolf += res[1];
				}
			}
		}
		return new int[] { sheep, wolf };
	}
	//BJ3187(DFS O)
}
