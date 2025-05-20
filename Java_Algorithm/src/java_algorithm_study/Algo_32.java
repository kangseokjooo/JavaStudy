package java_algorithm_study;

import java.util.Scanner;

public class Algo_32 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		int lose[] = new int[N];
		int joy[] = new int[N];

		for (int i = 0; i < N; i++) {
			lose[i] = s.nextInt();
		}
		for (int i = 0; i < N; i++) {
			joy[i] = s.nextInt();
		}

		int[] dp = new int[101];

		for (int i = 0; i < N; i++) {
			for (int j = 99; j >= lose[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j - lose[i]] + joy[i]);

			}
		}
		int max = 0;
		for (int i = 0; i < 100; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
	//BJ1535
}
