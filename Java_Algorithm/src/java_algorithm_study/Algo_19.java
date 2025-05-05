package java_algorithm_study;

import java.util.*;

public class Algo_19 {

	static int n, m, q;
	static boolean[][] ad;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		m = s.nextInt();

		ad = new boolean[n + 1][n + 1];

		for (int i = 0; i < m; i++) {
			int u = s.nextInt();
			int v = s.nextInt();
			ad[u][v] = true;
			ad[v][u] = true;
		}

		q = s.nextInt();

		for (int i = 0; i < q; i++) {
			int a = s.nextInt();
			int u = s.nextInt();
			int v = s.nextInt();

			if (a == 1) {
				ad[u][v] = true;
				ad[v][u] = true;
			} else if (a == 2) {
				ad[u][v] = false;
				ad[v][u] = false;
			}

			bfs();
		}

	}

	static void bfs() {
		int[] dist = new int[n + 1];
		Arrays.fill(dist, -1);

		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		dist[1] = 0;

		while (!q.isEmpty()) {
			int cur = q.poll();

			for (int i = 1; i <= n; i++) {
				if (ad[cur][i] && dist[i] == -1) {
					dist[i] = dist[cur] + 1;
					q.add(i);
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			System.out.print(dist[i] + (i == n ? "\n" : " "));
		}
	}
	//BJ14217(O)
}
