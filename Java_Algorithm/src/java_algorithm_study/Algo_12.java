package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algo_12 {
	static class Point {
		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int n;
	static Point[] points;
	static boolean visited[];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while (t-- > 0) {
			n = s.nextInt();
			points = new Point[n + 2];
			visited = new boolean[n + 2];

			for (int i = 0; i < n + 2; i++) {
				int x = s.nextInt();
				int y = s.nextInt();
				points[i] = new Point(x, y);
			}
			if (bfs()) {
				System.out.println("happy");
			} else {
				System.out.println("sad");
			}
		}
	}

	static boolean bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		visited[0] = true;

		while (!q.isEmpty()) {
			int now = q.poll();
			if (now == n + 1) {
				return true;
			}
			for (int i = 0; i < n + 2; i++) {
				if (!visited[i] && can(points[now], points[i])) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
		return false;
	}

	static boolean can(Point p1, Point p2) {
		int dist = Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
		return dist <= 1000;
	}
	//BJ9205
}
