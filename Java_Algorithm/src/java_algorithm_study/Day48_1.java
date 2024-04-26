package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Day48_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		
		//1<=A,B,C<=200
		boolean visited[][][] = new boolean[201][201][201];
		
		Queue<int[]> q = new LinkedList<int[]>();
		
		q.offer(new int[] { 0, 0, C });

		List<Integer> result = new ArrayList<Integer>();
		while (!q.isEmpty()) {
			int cur[] = q.poll();
			int a = cur[0];
			int b = cur[1];
			int c = cur[2];

			if (visited[a][b][c] == true)
				continue;

			visited[a][b][c] = true;

			if (a == 0) {
				result.add(c);
			}

			if (a + b >= B)
				q.offer(new int[] { a + b - B, B, c });
			else
				q.offer(new int[] { 0, a + b, c });

			if (a + c >= C)
				q.offer(new int[] { a + c - C, b, C });
			else
				q.offer(new int[] { 0, b, a + c });

			if (b + a >= A)
				q.offer(new int[] { A, b + a - A, c });
			else
				q.offer(new int[] { b + a, 0, c });

			if (b + c >= C)
				q.offer(new int[] { a, b + c - C, C });
			else
				q.offer(new int[] { a, 0, b + c });

			if (c + a >= A)
				q.offer(new int[] { A, b, c + a - A });
			else
				q.offer(new int[] { c + a, b, 0 });

			if (c + b >= B)
				q.offer(new int[] { a, B, c + b - B });
			else
				q.offer(new int[] { a, c + b, 0 });
		}

		Collections.sort(result);

		for (int n : result) {
			System.out.print(n + " ");
		}

	}

}
