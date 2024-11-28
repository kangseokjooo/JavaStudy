package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int T = s.nextInt();
		s.nextLine();

		int[] dx = { 0, 1, 0, -1 };
		int[] dy = { 1, 0, -1, 0 };

		for (int t = 0; t < T; t++) {
			String c = s.nextLine();
			int x = 0, y = 0; // 초기값
			int dir = 0;

			int minX = 0, minY = 0, maxX = 0, maxY = 0;

			for (char cmd : c.toCharArray()) {
				switch (cmd) {
				case 'F':
					x += dx[dir];
					y += dy[dir];
					break;
				case 'B':
					x -= dx[dir];
					y -= dy[dir];
					break;
				case 'L':
					dir = (dir + 3) % 4;
					break;
				case 'R':
					dir = (dir + 1) % 4;
					break;
				}
				minX = Math.min(minX, x);
				minY = Math.min(minY, y);
				maxX = Math.max(maxX, x);
				maxY = Math.max(maxY, y);
			}
			int area = (maxX - minX) * (maxY - minY);
			System.out.println(area);
		}
	}
	// BJ8911(O)
}
