package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class T_05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		String board = s.next();

		String[] boards = new String[N];
		for (int i = 0; i < N; i++) {
			boards[i] = s.next();
		}
		int cnt = 0;
		for (String old : boards) {
			if (can(old, board))
				cnt++;
		}
		System.out.println(cnt);
	}

	static boolean can(String old, String board) {
		Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
		for (int i = 0; i < old.length(); i++) {
			char c = old.charAt(i);
			map.computeIfAbsent(c, k -> new ArrayList<>()).add(i);
		}

		if (!map.containsKey(board.charAt(0)))
			return false; 

		for (int si : map.get(board.charAt(0))) {
			for (int ni : map.getOrDefault(board.charAt(1), Collections.emptyList())) {
				int diff = ni - si;
				if (diff <= 0)
					continue;

				int pos = si;
				boolean ok = true;

				for (int i = 1; i < board.length(); i++) {
					char c = board.charAt(i);
					int expected = si + diff * i;
					if (expected >= old.length() || old.charAt(expected) != c) {
						ok = false;
						break;
					}
				}
				if (ok)
					return true;

			}

		}
		return false;

	}

	// BJO S3 간판(X)

}
