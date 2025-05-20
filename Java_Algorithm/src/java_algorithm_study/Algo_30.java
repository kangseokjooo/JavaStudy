package java_algorithm_study;

import java.util.*;

public class Algo_30 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int M = s.nextInt();

		boolean[][] friend = new boolean[N + 1][N + 1];
		int total = 0;

		for (int i = 0; i < M; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			if (!friend[a][b]) {
				friend[a][b] = friend[b][a] = true;
				total++;
			}
		}

		int t = N * (N - 1) / 2;
		List<Integer> dList = new ArrayList<>();

		while (total < t) {
			boolean[][] nf = new boolean[N + 1][N + 1];
			int a = 0;

			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (i == j || friend[i][j])
						continue;

					for (int k = 1; k <= N; k++) {
						if (friend[i][k] && friend[k][j]) {
							nf[i][j] = nf[j][i] = true;
							break;
						}
					}
				}
			}

			for (int i = 1; i <= N; i++) {
				for (int j = i + 1; j <= N; j++) {
					if (nf[i][j] && !friend[i][j]) {
						friend[i][j] = friend[j][i] = true;
						a++;
						total++;
					}
				}
			}

			dList.add(a);
		}

		System.out.println(dList.size());
		for (int c : dList) {
			System.out.println(c);
		}
	}
	//BJ3098
}
