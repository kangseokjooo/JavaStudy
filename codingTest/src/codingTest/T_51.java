package codingTest;

import java.util.*;

public class T_51 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		for (int tc = 0; tc < t; tc++) {
			int H = s.nextInt();
			int W = s.nextInt();

			char[][] map = new char[H][W];

			for (int i = 0; i < H; i++) {
				String row = s.next();
				for (int j = 0; j < W; j++) {
					map[i][j] = row.charAt(j);
				}
			}
			boolean f[][] = new boolean[H][W];
			int answer = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (map[i][j] == '#') {
						f[i][j] = true;
					}
					if (j == W - 1) {
						int cnt = 0;
						for (int k = j; k >= 0; k--) {
							if (f[i][k] == true) {
								cnt++;
							}
							if (cnt == W) {
								answer++;
							}
						}
					}
					if (i == H - 1) {
						int cnt = 0;
						for (int k = i; k >= 0; k--) {
							if (f[k][j] == true) {
								cnt++;
							}
							if (cnt == H) {
								answer++;
							}
						}
					}
				}
			}
			boolean flag = true;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (map[i][j] == '.')
						flag = false;
				}
			}
			if (flag) {
				System.out.println(Math.min(H, W));
			} else {
				System.out.println(answer);
			}
		}
	}
	//SWEA D3 페인트칠 
}
