package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day77_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();

		if (N >= K) {
			System.out.println(N - K);
			return;
		}

		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[100001];
		q.offer(N);
		visited[N] = true;

		int[] time = new int[100001];

		while (!q.isEmpty()) {
			int cur = q.poll();

			int[] nextP = { cur - 1, cur + 1, cur * 2 };

			for (int next : nextP) {
				if (next >= 0 && next <= 100000 && !visited[next]) {
					q.offer(next);
					visited[next] = true;
					time[next] = time[cur] + 1;

					if (next == K) {
						System.out.println(time[next]);
						return;
					}
				}
			}
		}
	}
	//BJ1697
}
