package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.nextLine();
		char[][] ch = new char[N][N];

		for (int i = 0; i < N; i++) {
			String row = s.nextLine();
			for (int j = 0; j < N; j++) {
				ch[i][j] = row.charAt(j);
			}
		}

		int hcnt = 0;
		int vcnt = 0;

		for (int i = 0; i <N; i++) {
			int ecnt = 0;
			for (int j = 0; j < N; j++) {
				if (ch[i][j] == '.') {
					ecnt++;
				} else {
					if (ecnt >= 2) {
						hcnt++;
					}
					ecnt = 0;
				}
			}
			if (ecnt >= 2) {
				hcnt++;
			}
		}
		for (int j = 0; j < N; j++) {
			int ecnt = 0;
			for (int i = 0; i < N; i++) {
				if (ch[i][j] == '.') {
					ecnt++;
				} else {
					if (ecnt >= 2) {
						vcnt++;
					}
					ecnt = 0;
				}
			}
			if (ecnt >= 2) {
				vcnt++;
			}
		}
		System.out.println(hcnt+" "+vcnt);

	}

}
