package codingTest;

import java.util.Scanner;

public class T_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int[][] map = new int[N][2];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				map[i][j] = s.nextInt();
			}
		}

		int maxCnt = 0;
		int maxGrade = 6; 

		for (int i = 0; i <= 5; i++) {
			int cnt = 0;
			int cur = 0;

			for (int j = 0; j < N; j++) {
				if (map[j][0] == i || map[j][1] == i) {
					cnt++;
					cur = Math.max(cur, cnt);
				} else {
					cnt = 0;
				}
			}
			if (cur > maxCnt || (cur == maxCnt && i < maxGrade)) {
				maxCnt = cur;
				maxGrade = i;
			}
		}
		System.out.println(maxCnt + " " + maxGrade);

	}

}

//Programmers L2 그래픽스 퀴
