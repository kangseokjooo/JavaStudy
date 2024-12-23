package java_algorithm_study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Algorithm_28 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int M = s.nextInt();
		int S = s.nextInt();
		int E = s.nextInt();

		List<List<Integer>> graph = new ArrayList<List<Integer>>();

		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < M; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			graph.get(x).add(y);
			graph.get(y).add(x);
		}
		System.out.println(bfs(N, S, E, graph));
	}

	static int bfs(int N, int s, int e, List<List<Integer>> graph) {
		boolean[] visited = new boolean[N + 1];
		Queue<int[]> q = new LinkedList<int[]>();

		q.add(new int[] { s, 0 });

		visited[s] = true;

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int pos = cur[0];
			int time = cur[1];

			if (pos == e) {
				return time;
			}
			if(pos+1<=N&&!visited[pos+1]) {
				visited[pos+1]=true;
				q.add(new int[] {pos+1,time+1});
			}
			if(pos-1>=1&&!visited[pos-1]) {
				visited[pos-1]=true;
				q.add(new int[] {pos-1,time+1});
			}
			for(int n:graph.get(pos)) {
				if(!visited[n]) {
					visited[n]=true;
					q.add(new int[] {n,time+1});
				}
			}
		}
		return -1;
	}
	//BJ18232
}
