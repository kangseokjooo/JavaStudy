package java_algorithm_study;

import java.util.*;

public class Day44_1 {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int M = s.nextInt();
		int V = s.nextInt();

		graph = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}

		for (int i = 1; i <= N; i++) {
			Collections.sort(graph[i]);
		}

		visited = new boolean[N + 1];
		dfs(V);
		System.out.println();

		visited = new boolean[N + 1];
		bfs(V);
		System.out.println();
	}

	static void dfs(int start) {
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		visited[start] = true;
		System.out.print(start + " ");

		while (!stack.isEmpty()) {
			int v = stack.peek();
			boolean unvisited = false;

			for (int next : graph[v]) {
				if (!visited[next]) {
					stack.push(next);
					visited[next] = true;
					System.out.print(next + " ");
					unvisited = true;
					break;
				}
			}

			if (!unvisited) {
				stack.pop();
			}
		}
	}

	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int v = queue.poll();
			System.out.print(v + " ");

			for (int n : graph[v]) {
				if (!visited[n]) {
					queue.offer(n);
					visited[n] = true;
				}
			}
		}
	}
}
