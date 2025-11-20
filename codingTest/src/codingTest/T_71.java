package codingTest;

import java.util.*;

public class T_71 {
	static int N, M;
	static String[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 0; tc < t; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			arr = new String[N];
			for (int i = 0; i < N; i++)
				arr[i] = sc.next();

			int max = getMaxP();
			System.out.println("#" + (tc + 1) + " " + max);
		}
	}

	static int getMaxP() {
		Map<String, Integer> cntMap = new HashMap<String, Integer>();

		for (int i = 0; i < arr.length; i++) {
			cntMap.put(arr[i], cntMap.getOrDefault(arr[i], 0) + 1);
		}
		String center = "";
		int totalLen = 0;

		for (String s : arr) {
			int c = cntMap.getOrDefault(s, 0);
			if (c == 0)
				continue;
			String reverse = new StringBuilder(s).reverse().toString();
			// 팰린드롬 판단
			if (s.equals(reverse)) {
				int p = c / 2;
				totalLen += p * 2 * s.length();
				cntMap.put(s, c - p * 2);
				if (cntMap.get(s) > 0 && center.isEmpty()) {
					center = s;
				}
				// 역쌍존재 유무 판단
			} else if (cntMap.containsKey(reverse) && cntMap.get(reverse) > 0) {
				int p = c;
				totalLen += p * 2 * s.length();
				cntMap.put(s, c - p);
				cntMap.put(reverse, cntMap.get(reverse) - p);
			}
		}
		totalLen += center.length();

		return totalLen;

	}
	//SWEA 팰린드롬 문제 
}
