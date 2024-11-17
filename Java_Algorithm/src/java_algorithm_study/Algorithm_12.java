package java_algorithm_study;

import java.util.*;

public class Algorithm_12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int N = s.nextInt();
		int M = s.nextInt();

		List<List<Integer>> adjList = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			adjList.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			int u = s.nextInt();
			int v = s.nextInt();
			adjList.get(u).add(v);
			adjList.get(v).add(u);
		}

		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[N + 1];
		int[] distance = new int[N + 1];

		q.add(a);
		visited[a] = true;
		distance[a] = 0;

		while (!q.isEmpty()) {
			int cur = q.poll();

			if (cur == b) {
				System.out.println(distance[cur]);
				return;
			}

			for (int neighbor : adjList.get(cur)) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					distance[neighbor] = distance[cur] + 1;
					q.add(neighbor);
				}
			}
		}

		System.out.println(-1);
	}
}
