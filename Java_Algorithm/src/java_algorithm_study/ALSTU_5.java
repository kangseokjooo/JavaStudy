package java_algorithm_study;

import java.util.Scanner;

public class ALSTU_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();

		int minFloor = Integer.MAX_VALUE;

		for (int i = 0; i < m; i++) {
			int ui = s.nextInt();
			int di = s.nextInt();

			int low = 0, high = n;
			int result = Integer.MAX_VALUE;

			while (low <= high) {
				int mid = (low + high) / 2;
				int floor = ui * mid - di * (n - mid);

				if (floor > 0) {
					result = Math.min(result, floor);
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}

			minFloor = Math.min(minFloor, result);
		}

		System.out.println(minFloor);
	}
	// BJ3541(O)
}
