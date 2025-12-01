package codingTest;

import java.util.*;

public class T_103 {
	static int N, M;

	static int map[][];

	static List<int[]> Home;
	static List<int[]> Chicken;

	static int answer = Integer.MAX_VALUE;
	static boolean visited[];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		N = s.nextInt();
		M = s.nextInt();
		map = new int[N][N];
		Home = new ArrayList<int[]>();
		Chicken = new ArrayList<int[]>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = s.nextInt();
				if (map[i][j] == 1) {
					Home.add(new int[] { i, j });
				} else if (map[i][j] == 2) {
					Chicken.add(new int[] { i, j });
				} else {
					continue;
				}
			}
		}
		visited = new boolean[Chicken.size()];

		dfs(0, 0);

		System.out.println(answer);

	}

	static void dfs(int idx, int cnt) {
		if (cnt == M) {
			int sum = 0;
			for (int[] h : Home) {
				int min = Integer.MAX_VALUE;
				for (int i = 0; i < Chicken.size(); i++) {
					if (visited[i]) {
						int[] c = Chicken.get(i);
						min = Math.min(min, Math.abs(h[0] - c[0]) + Math.abs(h[1] - c[1]));
					}
				}
				sum += min;
			}
			answer = Math.min(answer, sum);

			return;
		}
		if (idx == Chicken.size())
			return;

		visited[idx] = true;
		dfs(idx + 1, cnt + 1);
		visited[idx] = false;
		dfs(idx + 1, cnt);
	}
	//G5 치킨배달 BOJ
}
