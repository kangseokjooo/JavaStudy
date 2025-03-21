package java_algorithm_study;

import java.util.Scanner;

public class ALSTU_7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int K = s.nextInt();
		s.nextLine();

		int[] choose = new int[N];
		for (int i = 0; i < N; i++) {
			choose[i] = s.nextInt();
		}

		System.out.println(find(N, K, choose));
	}

	static int find(int N, int K, int[] choose) {

		for (int M = 1; M <= N; M++) {
			int current = 0;
			for (int i = 0; i < M; i++) {
				current = choose[current];
			}
			if (current == K) {
				return M;
			}
		}
		return -1;
	}
	//BJ17204(O)
}
