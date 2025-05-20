package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Algo_34 {
	static int[][] map;
	static int N, M;
	static int max = 0;

	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { 1, -1, 0, 0 };

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		N = s.nextInt();
		M = s.nextInt();

		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = s.nextInt();

			}
		}

		makeWall(0);
		System.out.println(max);
		
	}

	static void makeWall(int cnt) {
		if (cnt == 3) {
			bfs();
			return;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0) {
					map[i][j] = 1;
					makeWall(cnt + 1);
					map[i][j] = 0;
				}
			}
		}
	}

	static void bfs() {
		Queue<int[]> q = new LinkedList<int[]>();
		int tMap[][]=new int[N][M];
		
		for(int i=0;i<N;i++) {
			tMap[i]=map[i].clone();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (tMap[i][j] == 2) {
					q.add(new int[] { i, j });
				}
			}
		}
		while (!q.isEmpty()) {
			int n[] = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = n[0] + dx[i];
				int ny = n[1] + dy[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
					if (tMap[nx][ny] == 0) {
						tMap[nx][ny] = 2;
						q.add(new int[] { nx, ny });
					}
				}
			}
		}
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (tMap[i][j] == 0)
					cnt++;
			}
		}
		max = Math.max(max, cnt);
		
		

	}

}
