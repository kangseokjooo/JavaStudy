package codingTest;

import java.util.*;

public class T_14 {
	static boolean KM(int x1, int y1, int x2, int y2) {
		int dx = Math.abs(x1 - x2);
		int dy = Math.abs(y1 - y2);
		return (dx == 1 && dy == 2) || (dx == 2 && dy == 1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = 36;
		int[][] path = new int[N][2];
		boolean[][] visited = new boolean[6][6];

		for (int i = 0; i < N; i++) {
			String pos = s.next();
			int x = pos.charAt(0) - 'A';
			int y = pos.charAt(1) - '1';
			path[i][0] = x;
			path[i][1] = y;
		}
		boolean valid = true;

		for (int i = 0; i < N; i++) {
			int x = path[i][0];
			int y = path[i][1];
			if (visited[x][y]) {
				valid = false;
				break;
			}
			visited[x][y] = true;
		}
		if (valid) {
			for (int i = 0; i < N - 1; i++) {
				if (!KM(path[i][0], path[i][1], path[i + 1][0], path[i + 1][1])) {
					valid = false;
					break;
				}
			}
		}

		if (valid) {
			if (!KM(path[N - 1][0], path[N - 1][1], path[0][0], path[0][1])) {
				valid = false;
			}
		}

		System.out.println(valid ? "Valid" : "Invalid");
	}
	// BOJ S4 나이트 투어
}
