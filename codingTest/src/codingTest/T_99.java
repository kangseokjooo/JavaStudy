package codingTest;

import java.util.*;

public class T_99 {
	static int N;
	static int[][] map;
	static int answer = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = s.nextInt();
			}
		}
		bt(0, map);
		System.out.println(answer);

	}

	static void bt(int d, int[][] map) {
		if (d == 5) {
			getMax(map);
			return;
		}
		for (int i = 0; i < 4; i++) {
			int moved[][] = move(map, i);
			bt(d + 1, moved);
		}
	}

	static void getMax(int[][] map) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				answer = Math.max(answer, map[i][j]);
			}
		}
	}

	static int[][] move(int map[][], int dir) {
		int newMap[][] = new int[N][N];

		for (int i = 0; i < N; i++) {
			newMap[i] = map[i].clone();
		}

		if (dir == 0)
			return up(newMap);
		if (dir == 1)
			return down(newMap);
		if (dir == 2)
			return left(newMap);
		if (dir == 3)
			return right(newMap);

		return newMap;
	}

	static int[][] up(int[][] map) {
		int newMap[][] = new int[N][N];

		for (int col = 0; col < N; col++) {
			int tmp[] = new int[N];
			int idx = 0;

			// 0제거
			for (int row = 0; row < N; row++) {
				if (map[row][col] != 0) {
					tmp[idx++] = map[row][col];
				}
			}
			// 병합
			for (int i = 0; i < idx - 1; i++) {
				if (tmp[i] == tmp[i + 1]) {
					tmp[i] *= 2;
					tmp[i + 1] = 0;
				}

			}
			int line[] = new int[N];
			int p = 0;
			for (int i = 0; i < idx; i++) {
				if (tmp[i] != 0)
					line[p++] = tmp[i];
			}
			for (int row = 0; row < N; row++) {
				newMap[row][col] = line[row];
			}
		}
		return newMap;

	}

	static int[][] down(int[][] map) {
		int newMap[][] = new int[N][N];

		for (int col = 0; col < N; col++) {
			int tmp[] = new int[N];
			int idx = 0;

			for (int row = N - 1; row >= 0; row--) {
				if (map[row][col] != 0) {
					tmp[idx++] = map[row][col];
				}
			}
			for (int i = 0; i < idx - 1; i++) {
				if (tmp[i] == tmp[i + 1]) {
					tmp[i] *= 2;
					tmp[i + 1] = 0;
					i++;
				}
			}
			int[] line = new int[N];
			int p = 0;
			for (int i = 0; i < idx; i++) {
				if (tmp[i] != 0)
					line[p++] = tmp[i];
			}
			for (int row = 0; row < N; row++) {
				newMap[N - 1 - row][col] = line[row];
			}
		}
		return newMap;
	}

	static int[][] left(int map[][]) {
		int[][] newMap = new int[N][N];

		for (int row = 0; row < N; row++) {
			int tmp[] = new int[N];
			int idx = 0;

			for (int col = 0; col < N; col++) {
				if (map[row][col] != 0) {
					tmp[idx++] = map[row][col];
				}
			}

			for (int i = 0; i < idx - 1; i++) {
				if (tmp[i] == tmp[i + 1]) {
					tmp[i] *= 2;
					tmp[i + 1] = 0;
					i++;
				}
			}
			int p = 0;
			for (int i = 0; i < idx; i++) {
				if (tmp[i] != 0)
					newMap[row][p++] = tmp[i];
			}
		}
		return newMap;
	}

	static int[][] right(int map[][]) {
		int[][] newMap = new int[N][N];

		for (int row = 0; row < N; row++) {
			int tmp[] = new int[N];
			int idx = 0;

			for (int col = N - 1; col >= 0; col--) {
				if (map[row][col] != 0) {
					tmp[idx++] = map[row][col];
				}
			}

			for (int i = 0; i < idx - 1; i++) {
				if (tmp[i] == tmp[i + 1]) {
					tmp[i] *= 2;
					tmp[i + 1] = 0;
					i++;
				}
			}
			int[] line = new int[N];
			int p = 0;
			for (int i = 0; i < idx; i++) {
				if (tmp[i] != 0)
					line[p++] = tmp[i];
			}
			for (int col = 0; col < N; col++) {
				newMap[row][N - 1 - col] = line[col];
			}
		}
		return newMap;
	}
	//2048(EASY) G1 BOJ
}
