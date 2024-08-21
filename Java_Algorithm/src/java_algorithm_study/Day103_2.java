package java_algorithm_study;

import java.util.*;

public class Day103_2 {
	static List<List<Integer>> graph;
	static int n;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		int m = s.nextInt();

		graph = new ArrayList<>(n + 1);
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			int u = s.nextInt();
			int v = s.nextInt();
			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		int[] distance = bfs(1);

		int q = s.nextInt();
		for (int i = 0; i < q; i++) {
			int u = s.nextInt();
			int v = s.nextInt();

			graph.get(u).add(v);
			graph.get(v).add(u);

			distance = bfs(1);

			for (int j = 1; j <= n; j++) {
				if (distance[j] == Integer.MAX_VALUE) {
					System.out.print("-1 ");
				} else {
					System.out.print(distance[j] + " ");
				}
			}
			System.out.println();
		}

		s.close();
	}

	static int[] bfs(int start) {
		int[] dist = new int[n + 1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		Queue<Integer> queue = new LinkedList<>();

		dist[start] = 0;
		queue.add(start);

		while (!queue.isEmpty()) {
			int node = queue.poll();
			for (int neighbor : graph.get(node)) {
				if (dist[neighbor] == Integer.MAX_VALUE) {
					dist[neighbor] = dist[node] + 1;
					queue.add(neighbor);
				}
			}
		}

		return dist;
	}
	//BJ14218
}
