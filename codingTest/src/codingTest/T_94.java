package codingTest;

import java.util.*;

public class T_94 {
	static int N, M;
	static char map[][];
	static boolean visited[][][][];

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		M = s.nextInt();

		map = new char[N][M];

		visited = new boolean[N][M][N][M];

		int rx = 0, ry = 0, bx = 0, by = 0;
		for (int i = 0; i < N; i++) {
			String row = s.next();
			for (int j = 0; j < M; j++) {
				map[i][j] = row.charAt(j);

				if (map[i][j] == 'R') {
					rx = i;
					ry = j;
				}
				if (map[i][j] == 'B') {
					bx = i;
					by = j;
				}
			}
		}
		int answer = bfs(rx, ry, bx, by);

		System.out.println(answer);

	}

	static int bfs(int rx, int ry, int bx, int by) {
		Queue<int[]> q = new LinkedList<int[]>();
		visited[rx][ry][bx][by] = true;
		q.add(new int[] { rx, ry, bx, by, 0 });

		while (!q.isEmpty()) {
			int cur[] = q.poll();
			int crx = cur[0], cry = cur[1];
			int cbx = cur[2], cby = cur[3];
			int cnt = cur[4];

			if (cnt >= 10)
				return -1;

			for (int i = 0; i < 4; i++) {
				int[] rm = roll(crx, cry, i);
				int nrx = rm[0];
				int nry = rm[1];
				boolean redin = (rm[2] == 1);

				int[] bm = roll(cbx, cby, i);
				int nbx = bm[0];
				int nby = bm[1];
				boolean bluein = (bm[2] == 1);

				if (bluein)
					continue;
				if (redin)
					return cnt + 1;

				if (nrx == nbx && nry == nby) {
					int distRed=Math.abs(crx-nrx)+Math.abs(cry-nry);
					int distBlue=Math.abs(cbx-nbx)+Math.abs(cby-nby);
					if(distRed>distBlue) {
						nrx-=dx[i];
						nry-=dy[i];
					}else {
						nbx-=dx[i];
						nby-=dy[i];
					}
				}
				if (!visited[nrx][nry][nbx][nby]) {
					visited[nrx][nry][nbx][nby] = true;
					q.add(new int[] { nrx, nry, nbx, nby, cnt + 1 });
				}

			}
		}
		return -1;

	}

	static int[] roll(int x, int y, int d) {
		while (true) {
			int nx = x + dx[d];
			int ny = y + dy[d];

			if (map[nx][ny] == '#')
				break;
			if (map[nx][ny] == 'O') {
				return new int[] { nx, ny, 1 };
			}

			x = nx;
			y = ny;
		}
		
		return new int[] { x, y, 0 };

	}
}
