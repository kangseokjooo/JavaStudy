package java_algorithm_study;

import java.util.Scanner;

public class Day93_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		s.nextLine();

		for (int i = 0; i < t; i++) {
			if (i > 0)
				s.nextLine();

			int r = s.nextInt();
			int c = s.nextInt();
			s.nextLine();

			char box[][] = new char[r][c];

			for (int j = 0; j < r; j++) {
				box[j] = s.nextLine().toCharArray();
			}
			int cnt = Candy(box, r, c);
			System.out.println(cnt);
		}
	}

	static int Candy(char[][] box, int r, int c) {
		int cnt = 0;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c - 2; j++) {
				if (box[i][j] == '>' && box[i][j + 1] == 'o' && box[i][j + 2] == '<') {
					cnt++;
				}
			}
		}
		for (int i = 0; i < r - 2; i++) {
			for (int j = 0; j < c; j++) {
				if (box[i][j] == 'v' && box[i + 1][j] == 'o' && box[i + 2][j] == '^') {
					cnt++;
				}
			}
		}
		return cnt;
	}
	//BJ2508
}
