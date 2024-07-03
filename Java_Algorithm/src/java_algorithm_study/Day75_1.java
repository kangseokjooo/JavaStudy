package java_algorithm_study;

import java.util.Scanner;

public class Day75_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();

		int minP = Integer.MAX_VALUE;
		int minS = Integer.MAX_VALUE;

		for (int i = 0; i < M; i++) {
			int pp = s.nextInt();
			int sp = s.nextInt();

			if (pp < minP) {
				minP = pp;
			}
			if (sp < minS) {
				minS = sp;
			}
		}
		int cost = 0;

		cost = (N / 6) * minP + (N % 6) * minS;

		int costP = ((N / 6) + 1) * minP;

		int costS = N * minS;

		int min = Math.min(costP, Math.min(cost, costS));

		System.out.println(min);

	}
	//BJ1049
}
