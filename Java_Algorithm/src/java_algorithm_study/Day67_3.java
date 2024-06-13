package java_algorithm_study;

import java.util.Scanner;

public class Day67_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String king = s.next();
		String stone = s.next();

		int N = s.nextInt();
		s.nextLine();

		int kR = king.charAt(1) - '1';
		int kC = king.charAt(0) - 'A';
		int sR = stone.charAt(1) - '1';
		int sC = stone.charAt(0) - 'A';

		for (int i = 0; i < N; i++) {
			String m = s.nextLine();
			int[] d = dir(m);

			int nkR = kR + d[0];
			int nkC = kC + d[1];

			if (nkR >= 0 && nkR < 8 && nkC >= 0 && nkC < 8) {
				if (nkR == sR && nkC == sC) {
					int nsR = sR + d[0];
					int nsC = sC + d[1];
					if (nsR >= 0 && nsR < 8 && nsC >= 0 && nsC < 8) {
						kR = nkR;
						kC = nkC;
						sR = nsR;
						sC = nsC;
					}
				} else {
					kR = nkR;
					kC = nkC;
				}
			}
		}
		System.out.println((char) (kC + 'A') + "" + (kR + 1));
		System.out.println((char) (sC + 'A') + "" + (sR + 1));
	}

	static int[] dir(String move) {
		switch (move) {
		case "R":
			return new int[] { 0, 1 };
		case "L":
			return new int[] { 0, -1 };
		case "B":
			return new int[] { -1, 0 };
		case "T":
			return new int[] { 1, 0 };
		case "RT":
			return new int[] { 1, 1 };
		case "LT":
			return new int[] { 1, -1 };
		case "RB":
			return new int[] { -1, 1 };
		case "LB":
			return new int[] { -1, -1 };
		default:
			return new int[] { 0, 0 };
		}
	}

}
