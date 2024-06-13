package java_algorithm_study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Day67_4 {
	static ArrayList<Integer>[] graph;
	static boolean visited[];
	static int n, m;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		m = s.nextInt();

		graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}
		int icnt = 0;
		visited = new boolean[n + 1];
		visited[1] = true;
		dfs(1, graph, 0);

		for (int i = 2; i < visited.length; i++) {
			if (visited[i])
				icnt++;
		}
		System.out.println(icnt);
	}

	static void dfs(int n, List<Integer>[] list, int m) {
		if (m == 2) {
			return;
		}
		for (int i = 0; i < list[n].size(); i++) {
			int next = list[n].get(i);
			visited[next] = true;
			dfs(next, list, m + 1);
		}
	}
	// BJ5567
}
