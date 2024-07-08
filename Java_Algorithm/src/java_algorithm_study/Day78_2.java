package java_algorithm_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day78_2 {
	static int N;
	static List<Integer>[] graph;
	static boolean[] visited;
	static boolean[] stack;
	static boolean isCycle;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		N = s.nextInt();

		graph = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}

		for (int i = 1; i < N; i++) {
			int M = s.nextInt();
			for (int j = 0; j < M; j++) {
				int C = s.nextInt();
				graph[i].add(C);
			}
		}

		visited = new boolean[N + 1];
		stack = new boolean[N + 1];
		isCycle = false;

		dfs(1);

		if (isCycle) {
			System.out.println("CYCLE");
		} else {
			System.out.println("NO CYCLE");
		}

		s.close();
	}

	static void dfs(int v) {
		visited[v] = true;
		stack[v] = true;

		for (int next : graph[v]) {
			if (!visited[next]) {
				dfs(next);
			} else if (stack[next]) {

				isCycle = true;
			}
		}

		stack[v] = false;
	}
	//BJ11581
}
