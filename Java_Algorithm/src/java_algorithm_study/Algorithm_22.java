package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String S = s.next();
		int cntZero = 0;
		int cntOne = 0;

		if (S.charAt(0) == '0') {
			cntZero++;
		} else {
			cntOne++;
		}

		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i) != S.charAt(i - 1)) {
				if (S.charAt(i) == '0') {
					cntZero++;
				} else {
					cntOne++;
				}
			}
		}
		System.out.println(Math.min(cntZero, cntOne));
	}
	//BJ1439
}
