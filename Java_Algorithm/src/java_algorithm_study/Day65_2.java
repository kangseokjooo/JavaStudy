package java_algorithm_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day65_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String moves = s.next();

		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, -1, 0, 1 };

		int x = 0, y = 0, dir = 0;

		List<int[]> li = new ArrayList<>();
		li.add(new int[] { x, y });

		for (char mov : moves.toCharArray()) {
			if (mov == 'L') {
				dir = (dir + 1) % 4;
			} else if (mov == 'R') {
				dir = (dir + 3) % 4;
			} else if (mov == 'F') {
				x += dx[dir];
				y += dy[dir];
				li.add(new int[] { x, y });
			}
		}

		int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

		for (int[] pos : li) {
			minX = Math.min(minX, pos[0]);
			minY = Math.min(minY, pos[1]);
			maxX = Math.max(maxX, pos[0]);
			maxY = Math.max(maxY, pos[1]);
		}

		int r = maxX - minX + 1;
		int c = maxY - minY + 1;

		char[][] miro = new char[r][c];
		for (char[] row : miro) {
			Arrays.fill(row, '#');
		}

		for (int[] pos : li) {
			miro[pos[0] - minX][pos[1] - minY] = '.';
		}

		for (char[] row : miro) {
			for (int i = 0, j = row.length - 1; i < j; i++, j--) {
				char temp = row[i];
				row[i] = row[j];
				row[j] = temp;
			}
			System.out.println(new String(row));
		}
	}
}
