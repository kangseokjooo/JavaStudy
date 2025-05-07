package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Algo_20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();

		String[] words = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = s.nextLine();
		}

		Arrays.sort(words);

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			boolean isPossible = false;
			for (int j = i + 1; j < n; j++) {
				if (words[j].startsWith(words[i])) {
					isPossible = true;
					break;
				}
			}
			if (!isPossible) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	// BJ1141
}
