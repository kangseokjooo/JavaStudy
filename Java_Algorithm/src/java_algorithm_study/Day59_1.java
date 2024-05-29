package java_algorithm_study;

import java.util.Scanner;

public class Day59_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int[][] coins = new int[N][M];

		for (int i = 0; i < N; i++) {
			String row=s.next();
			for (int j = 0; j < M; j++) {
				coins[i][j] = row.charAt(j)-'0';
			}
		}

		int fcnt = 0;

		for (int i = N - 1; i >= 0; i--) {
			for (int j = M - 1; j >= 0; j--) {
				if (coins[i][j] == 1) {
					flip(i, j, coins);
					fcnt++;
				}
			}
		}

		System.out.println(fcnt);
	}

	private static void flip(int a, int b, int[][] coins) {
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j <= b; j++) {
				coins[i][j] = 1 - coins[i][j];
			}
		}
	}
}
