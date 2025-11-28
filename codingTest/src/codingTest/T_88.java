package codingTest;

import java.util.*;

public class T_88 {
	static int M, N;
	static int map[][];
	static int x, y;
	static int dice[] = new int[6]; // {위,북,동,서,남,밑바닥}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		M = s.nextInt();
		N = s.nextInt();
		x = s.nextInt();
		y = s.nextInt();

		int K = s.nextInt();

		map = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < K; i++) {
			int commands = s.nextInt();
			if (commands == 1)
				goEast();
			if (commands == 2)
				goWest();
			if (commands == 3)
				goNorth();
			if (commands == 4)
				goSouth();
		}

	}

	static void printTop() {
		System.out.println(dice[0]);
	}

	static boolean isValid(int nx, int ny) {
		return nx < 0 || ny < 0 || nx >= M || ny >= N;
	}

	static void applyMap() {
		if (map[x][y] == 0) {
			map[x][y] = dice[5];
		} else {
			dice[5] = map[x][y];
			map[x][y] = 0;
		}
	}

	// {위,북,동,서,남,밑바닥}
	static void goEast() {
		int nx = x, ny = y + 1;
		if (isValid(nx, ny))
			return;

		y = ny;

		int t = dice[0];
		dice[0] = dice[3];
		dice[3] = dice[5];
		dice[5] = dice[2];
		dice[2] = t;

		applyMap();
		printTop();

	}

	// {위,북,동,서,남,밑바닥}
	static void goWest() {
		int nx = x, ny = y - 1;
		if (isValid(nx, ny))
			return;
		y = ny;

		int t = dice[0];
		dice[0] = dice[2];
		dice[2] = dice[5];
		dice[5] = dice[3];
		dice[3] = t;

		applyMap();
		printTop();
	}

	// {위,북,동,서,남,밑바닥}
	static void goNorth() {
		int nx = x - 1, ny = y;
		if (isValid(nx, ny))
			return;

		x = nx;

		int t = dice[0];
		dice[0] = dice[4];
		dice[4] = dice[5];
		dice[5] = dice[1];
		dice[1] = t;

		applyMap();
		printTop();

	}

	// {위,북,동,서,남,밑바닥}
	static void goSouth() {
		int nx = x + 1, ny = y;

		if (isValid(nx, ny))
			return;

		x = nx;

		int t = dice[0];
		dice[0] = dice[1];
		dice[1] = dice[5];
		dice[5] = dice[4];
		dice[4] = t;

		applyMap();
		printTop();

	}

}
