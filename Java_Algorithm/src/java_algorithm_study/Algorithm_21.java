package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algorithm_21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int S = s.nextInt();
		int D = s.nextInt();
		int F = s.nextInt();
		int B = s.nextInt();
		int K = s.nextInt();

		boolean police[] = new boolean[N + 1];

		if (K > 0) {
			for (int i = 0; i < K; i++) {
				int PL = s.nextInt();
				police[PL] = true;
			}
		}

		Queue<int[]> q = new LinkedList<int[]>();
		boolean visited[] = new boolean[N + 1];

		q.add(new int[] { S, 0 });
		visited[S] = true;

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int curB = cur[0];
			int button = cur[1];

			if (curB == D) {
				System.out.println(button);
				return;
			}
			int forwardB = curB + F;
			if (forwardB <= N && !visited[forwardB] && !police[forwardB]) {
				q.add(new int[] { forwardB, button + 1 });
				visited[forwardB] = true;
			}
			int bacwardB = curB - B;
			if (bacwardB > 0 && !visited[bacwardB] && !police[bacwardB]) {
				q.add(new int[] { bacwardB, button + 1 });
				visited[bacwardB] = true;
			}
		}
		System.out.println("BUG FOUND");
	}
	//BJ13700
}
