package java_algorithm_study;

import java.util.*;

public class Algo_14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int R = s.nextInt();
		int C = s.nextInt();
		int Q = s.nextInt();

		int[][] photo = new int[R + 1][C + 1];
		int[][] sum = new int[R + 1][C + 1];

		for (int i = 1; i <= R; i++) {
			for (int j = 1; j <= C; j++) {
				photo[i][j] = s.nextInt();

				sum[i][j] = photo[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
			}
		}

		for (int q = 0; q < Q; q++) {
			int r1 = s.nextInt();
			int c1 = s.nextInt();
			int r2 = s.nextInt();
			int c2 = s.nextInt();

			int total = sum[r2][c2] - sum[r1 - 1][c2] - sum[r2][c1 - 1] + sum[r1 - 1][c1 - 1];
			int area = (r2 - r1 + 1) * (c2 - c1 + 1);
			int avg = total / area;
			System.out.println(avg);
		}
	}
	//BJ16507
}
