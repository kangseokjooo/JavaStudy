package java_algorithm_study;

import java.util.Scanner;

public class Day53_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();

			int result = Candies(A, B, C);
			System.out.println("#"+(t+1)+" "+result);
		}

		sc.close();
	}

	public static int Candies(int A, int B, int C) {

		if (A < B && B < C) {
			return 0;
		}

		int minEat = Integer.MAX_VALUE;

		if (A < B && B >= C) {
			int candiesB = B - (C - 1);
			if (candiesB >= 0) {
				int newB = B - candiesB;
				int candiesA = A - (newB - 1);
				if (candiesA >= 0) {
					minEat = candiesA + candiesB;
				}
			}
		}

		if (B < C && A >= B) {
			int candiesA = A - (B - 1);
			if (candiesA >= 0) {
				int newA = A - candiesA;
				int candiesB = B - (newA + 1);
				if (candiesB >= 0) {
					minEat = Math.min(minEat, candiesB + candiesB);
				}
			}
		}

		if (minEat == Integer.MAX_VALUE) {
			return -1;
		}

		return minEat;
	}
}
