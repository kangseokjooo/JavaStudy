package codingTest;

import java.util.*;

//길을 지나갈 수 있으려면 길에 속한 모든 칸의 높이가 모두 같아야 한다. 또는, 경사로를 놓아서 지나갈 수 있는 길을 만들 수 있다. 경사로는 높이가 항상 1이며, 길이는 L이다. 또, 개수는 매우 많아 부족할 일이 없다. 경사로는 낮은 칸과 높은 칸을 연결하며, 아래와 같은 조건을 만족해야한다.
//* 경사로는 낮은 칸에 놓으며, L개의 연속된 칸에 경사로의 바닥이 모두 접해야 한다.
//* 낮은 칸과 높은 칸의 높이 차이는 1이어야 한다.
//* 경사로를 놓을 낮은 칸의 높이는 모두 같아야 하고, L개의 칸이 연속되어 있어야 한다.
//아래와 같은 경우에는 경사로를 놓을 수 없다.
//* 경사로를 놓은 곳에 또 경사로를 놓는 경우
//* 낮은 칸과 높은 칸의 높이 차이가 1이 아닌 경우
//* 낮은 지점의 칸의 높이가 모두 같지 않거나, L개가 연속되지 않은 경우
//* 경사로를 놓다가 범위를 벗어나는 경우

public class T_96 {
	static int N;
	static int map[][];
	static int L;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		N = s.nextInt();
		map = new int[N][N];
		// 경사로는 무조건 1 땅에 접해야하는 부분의 길이 223(o)
		L = s.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = s.nextInt();
			}
		}

		int answer = chWidth(map) + chHeight(map);

		System.out.println(answer);

	}

	// 가로 판단
	static int chWidth(int map[][]) {
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			int tmp[] = map[i];
			boolean possible = true;
			boolean visited[] = new boolean[N];
			for (int j = 0; j < N - 1; j++) {
				int cur = tmp[j];
				int next = tmp[j + 1];

				if (cur == next)
					continue;

				else if (cur + 1 == next) {
					for (int k = 0; k < L; k++) {
						if (j - k < 0 || tmp[j - k] != cur || visited[j - k]) {
							possible = false;
							break;
						}
						visited[j - k] = true;
					}
					if (!possible)
						break;
				} else if (cur == next + 1) {
					for (int k = 1; k <= L; k++) {
						if (j + k >= N || tmp[j + k] != next || visited[j + k]) {
							possible = false;
							break;
						}
						visited[j + k] = true;
					}
					if (!possible)
						break;
				} else if (Math.abs(cur - next) >= 2) {
					possible = false;
					break;
				}
			}
			if (possible)
				cnt++;

		}
		return cnt;
	}

	static int chHeight(int map[][]) {
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int tmp[] = new int[N];
			for (int j = 0; j < N; j++) {
				tmp[j] = map[j][i];
			}
			boolean visited[] = new boolean[N];
			boolean possible = true;

			for (int k = 0; k < N - 1; k++) {
				int cur = tmp[k];
				int next = tmp[k + 1];

				if (cur == next)
					continue;

				else if (cur + 1 == next) {
					for (int s = 0; s < L; s++) {
						if (k - s < 0 || tmp[k - s] != cur || visited[k - s]) {
							possible = false;
							break;
						}
						visited[k - s] = true;
					}
					if (!possible)
						break;
				} else if (cur == next + 1) {
					for (int s = 1; s <= L; s++) {
						if (k + s >= N || tmp[k + s] != next || visited[k + s]) {
							possible = false;
							break;
						}
						visited[k + s] = true;
					}
					if (!possible)
						break;
				} else if (Math.abs(cur - next) >= 2) {
					possible = false;
					break;
				}
			}
			if (possible)
				cnt++;
		}
		return cnt;

	}
	// BOJ 경사로 G3

}
