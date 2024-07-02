package java_algorithm_study;

import java.util.Scanner;

public class Day74_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		int[][] a = new int[n][m];
		int[][] b = new int[n][m];

		for (int i = 0; i < n; i++) {
			String row = s.next();
			for (int j = 0; j < m; j++) {
				a[i][j] = row.charAt(j) - '0';
			}
		}
		for (int i = 0; i < n; i++) {
			String row = s.next();
			for (int j = 0; j < m; j++) {
				b[i][j] = row.charAt(j) - '0';
			}
		}
		int c = 0;

		for (int i = 0; i <= n - 3; i++) {
			for (int j = 0; j <= m - 3; j++) {
				if (a[i][j] != b[i][j]) {
					flip(a, i, j);
					c++;
				}
			}
		}
		if (isE(a, b, n, m)) {
			System.out.println(c);
		} else {
			System.out.println(-1);
		}
	}

	static void flip(int[][] a, int x, int y) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[x + i][y + j] = 1 - a[x + i][y + j];
			}
		}
	}

	static boolean isE(int[][] a, int[][] b, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	//BJ1080
}
