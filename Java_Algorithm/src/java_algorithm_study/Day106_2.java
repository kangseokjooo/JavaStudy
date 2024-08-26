package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day106_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		Work[] w = new Work[N];

		for (int i = 0; i < N; i++) {
			int T = s.nextInt();
			int S = s.nextInt();
			w[i] = new Work(T, S);
		}

		Arrays.sort(w, (a, b) -> b.deadline - a.deadline);

		int late = w[0].deadline;

		for (Work work : w) {

			late = Math.min(late, work.deadline) - work.duration;
			if (late < 0) {
				System.out.println("-1");
				return;
			}
		}

		System.out.println(late);
	}
}

class Work {
	int duration;
	int deadline;

	Work(int duration, int deadline) {
		this.duration = duration;
		this.deadline = deadline;
	}
	//BJ1264
}
