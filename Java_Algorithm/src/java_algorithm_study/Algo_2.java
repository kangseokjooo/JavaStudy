package java_algorithm_study;

import java.util.Scanner;

public class Algo_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int K = s.nextInt();

		int[] dir = new int[6];
		int[] len = new int[6];

		for (int i = 0; i < 6; i++) {
			dir[i] = s.nextInt();
			len[i] = s.nextInt();
		}

		int mw = 0;
		int mh = 0;
		int mwIdx = 0;
		int mhIdx = 0;

		for (int i = 0; i < 6; i++) {
			if (dir[i] == 1 || dir[i] == 2) {
				if (len[i] > mw) {
					mw = len[i];
					mwIdx = i;
				}
			} else {
				if (len[i] > mh) {
					mh = len[i];
					mhIdx = i;
				}
			}
		}
		int sw=len[(mhIdx+3)%6];
		int sh=len[(mwIdx+3)%6];
		
		int area=(mw*mh)-(sw*sh);
		System.out.println(area*K);
	}

}
