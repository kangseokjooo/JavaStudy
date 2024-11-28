package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int M = s.nextInt();

		int map[][] = new int[100][100];

		for (int i = 0; i < N; i++) {
			int x1 = s.nextInt() - 1;
			int y1 = s.nextInt() - 1;
			int x2 = s.nextInt() - 1;
			int y2 = s.nextInt() - 1;

			for (int x = x1; x <= x2; x++) {
				for (int y = y1; y <= y2; y++) {
					map[x][y]++;
				}
			}
		}
		int cnt = 0;
		for (int x = 0; x < 100; x++) {
			for (int y = 0; y < 100; y++) {
				if (map[x][y] > M) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	// BJ1531(O)
}
