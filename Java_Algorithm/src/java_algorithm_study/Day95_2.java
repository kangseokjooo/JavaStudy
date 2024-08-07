package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day95_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		s.nextLine();

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			String word = s.nextLine();

			if (isGroup(word)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	static boolean isGroup(String word) {
		boolean[] s = new boolean[26];
		char ch = ' ';
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c != ch) {
				if (s[c - 'a']) {
					return false;
				}
				s[c - 'a'] = true;
				ch = c;
			}
		}
		return true;
	}
	//BJ1316(O)
}
