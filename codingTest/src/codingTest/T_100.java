package codingTest;

import java.util.*;

public class T_100 {
	static int N, M;
	static int[][] map;

	static class CCTV {
		int x, y, type;

		CCTV(int x, int y, int type) {
			this.x = x;
			this.y = y;
			this.type = type;
		}
	}

	static List<CCTV> cctvs = new ArrayList<>();
	// 우 하 좌 상
	// 0 1 2 3
	static int dir[][][] = { {}, { { 0 }, { 1 }, { 2 }, { 3 } }, { { 0, 2 }, { 1, 3 } },
			{ { 0, 3 }, { 0, 1 }, { 1, 2 }, { 2, 3 } }, { { 0, 1, 3 }, { 0, 1, 2 }, { 1, 2, 3 }, { 0, 2, 3 } },
			{ { 0, 1, 2, 3 } } };
	// 우 하 좌 상
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { 1, 0, -1, 0 };

	static int answer = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		M = s.nextInt();

		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = s.nextInt();
				if (map[i][j] >= 1 && map[i][j] <= 5) {
					cctvs.add(new CCTV(i, j, map[i][j]));
				}
			}
		}
		dfs(0, map);
		System.out.println(answer);

	}

	static void dfs(int idx, int[][] map) {
		if (idx == cctvs.size()) {
			answer = Math.min(answer, countSpot(map));
			return;
		}

		CCTV c = cctvs.get(idx);

		for (int dir[] : dir[c.type]) {
			int copy[][] = copy(map);
			watch(copy, c.x, c.y, dir);
			dfs(idx + 1, copy);
		}
	}

	static int[][] copy(int map[][]) {
		int copyMap[][] = new int[N][M];

		for (int i = 0; i < N; i++) {
			copyMap[i] = map[i].clone();
		}
		return copyMap;
	}

	static void watch(int map[][], int x, int y, int[] dir) {
		for (int d : dir) {
			int nx = x, ny = y;

			while (true) {
				nx += dx[d];
				ny += dy[d];

				if (nx < 0 || ny < 0 || nx >= N || ny >= M)
					break;
				if (map[nx][ny] == 6)
					break;
				// # -> -1
				if (map[nx][ny] == 0) {
					map[nx][ny] = -1;
				}
			}
		}
	}

	static int countSpot(int map[][]) {
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0)
					cnt++;
			}
		}
		return cnt;
	}
}
