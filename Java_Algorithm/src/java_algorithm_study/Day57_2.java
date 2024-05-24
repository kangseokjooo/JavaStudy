package java_algorithm_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Day57_2 {
	static List<int[]> li;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		li = new ArrayList<int[]>();

		for (int i = 0; i < M; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int cost = s.nextInt();
			if (a <= M && b <= M) {
				li.add(new int[] { a, b, cost });
			}
		}

		int start = s.nextInt();

		int end = s.nextInt();
		int mincost = bfs(N, start, end);

		if (mincost == Integer.MAX_VALUE) {
			System.out.println(0);
		} else {
			System.out.println(mincost);
		}
	}

	static int bfs(int N, int start, int end) {
		Queue<Integer> q = new LinkedList<>();
		int arr[] = new int[N + 1];
		Arrays.fill(arr, Integer.MAX_VALUE);
		arr[start] = 0;

		q.offer(start);

		while (!q.isEmpty()) {
			int cur = q.poll();

			for (int[] info : li) {
				if (info[0] == cur) {
					int nextcity = info[1];
					int cost = info[2];

					if (arr[nextcity] > arr[cur] + cost) {
						arr[nextcity] = arr[cur] + cost;
						q.offer(nextcity);
					}
				}
			}
		}

		return arr[end];
	}
}
