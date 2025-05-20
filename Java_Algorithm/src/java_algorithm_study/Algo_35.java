package java_algorithm_study;

import java.util.Scanner;

public class Algo_35 {
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int N;
	static int num[];
	static int ops[];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		N = s.nextInt();
		num = new int[N];
		ops = new int[4];

		for (int i = 0; i < N; i++) {
			num[i] = s.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			ops[i] = s.nextInt();
		}

		dfs(1, num[0]);
		System.out.println(max);
		System.out.println(min);
	}

	static void dfs(int idx, int result) {
		if (idx == N) {
			max = Math.max(max, result);
			min = Math.min(min, result);
		}

		for (int i = 0; i < 4; i++) {
			if (ops[i] > 0) {
				ops[i]--;
				if (i == 0)
					dfs(idx + 1, result + num[idx]);
				else if (i == 1)
					dfs(idx + 1, result - num[idx]);
				else if (i == 2)
					dfs(idx + 1, result * num[idx]);
				else if (i == 3)
					dfs(idx + 1, result / num[idx]);
				
				ops[i]++;
			}
		}
	}
}
