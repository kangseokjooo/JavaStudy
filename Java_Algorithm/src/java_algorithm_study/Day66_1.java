package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day66_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] diff = new int[N];

		for (int i = 0; i < N; i++) {
			int A = s.nextInt();
			int B = s.nextInt();
			diff[i] = A - B;
		}

		Arrays.sort(diff);

		int mid1 = diff[(N - 1) / 2];
		int mid2 = diff[N / 2];

		int min = mid1;
		int max = mid2;
		int cnt = max - min + 1;

		System.out.println(cnt);
	}
}
