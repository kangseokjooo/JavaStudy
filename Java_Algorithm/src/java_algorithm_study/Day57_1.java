package java_algorithm_study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day57_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int[][] arr = new int[N][M];

		for (int i = 0; i < N; i++) {
			String row = s.next();
			for (int j = 0; j < M; j++) {
				arr[i][j] = row.charAt(j) - '0';
			}
		}

		int K = s.nextInt();

		Map<String, Integer> m = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < M; j++) {
				sb.append(arr[i][j]);
			}
			String str = sb.toString();
			m.put(str, m.getOrDefault(str, 0) + 1);
		}
		int max = 0;
		for (Map.Entry<String, Integer> en : m.entrySet()) {
			String str = en.getKey();
			int cnt = en.getValue();

			int zcnt = 0;
			for (char c : str.toCharArray()) {
				if (c == '0') {
					zcnt++;
				}
			}
			if (zcnt <= K && zcnt % 2 == K % 2) {
				max = Math.max(max, cnt);
			}
		}
		System.out.println(max);

	}

}
