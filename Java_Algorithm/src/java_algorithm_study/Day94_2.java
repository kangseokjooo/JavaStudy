package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day94_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int T = s.nextInt();

		for (int t = 0; t < T; t++) {
			int[][] points = new int[4][2];
			for (int i = 0; i < 4; i++) {
				points[i][0] = s.nextInt();
				points[i][1] = s.nextInt();
			}
			System.out.println(isSquare(points) ? 1 : 0);
		}
	}

	static boolean isSquare(int points[][]) {
		Set<Integer> dist = new HashSet<Integer>();

		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {
				int d = Distance(points[i], points[j]);
				dist.add(d);
			}
		}
		return dist.size() == 2 && !dist.contains(0);
	}

	private static int Distance(int[] p1, int[] p2) {
		return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
	}
	//BJ1485
}
