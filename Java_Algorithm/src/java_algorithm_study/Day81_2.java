package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day81_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int H = s.nextInt();

		int T[] = new int[N / 2];
		int B[] = new int[N / 2];

		for (int i = 0; i < N / 2; i++) {
			B[i] = s.nextInt();
			T[i] = s.nextInt();
		}

		Arrays.sort(B);
		Arrays.sort(T);

		int min = Integer.MAX_VALUE;
		int cnt = 0;

		for (int i = 1; i <= H; i++) {
			int ob = binarySearch(B, i, true) + binarySearch(T, H - i, false);
			if (ob < min) {
				min = ob;
				cnt = 1;
			} else if (ob == min) {
				cnt++;
			}
		}
		System.out.println(min + " " + cnt);
	}

	static int binarySearch(int arr[], int h, boolean isBottom) {
		int l = 0;
		int r = arr.length - 1;
		int result = arr.length;

		while (l <= r) {
			int m = (l + r) / 2;

			if (isBottom) {
				if (arr[m] >= h) {
					result = m;
					r = m - 1;
				} else {
					l = m + 1;
				}
			} else {
				if (arr[m] > h) {
					result = m;
					r = m - 1;
				} else {
					l = m + 1;
				}
			}
		}
		return arr.length - result;
	}
	//BJ3020
}
