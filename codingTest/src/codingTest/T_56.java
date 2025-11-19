package codingTest;

import java.util.*;

public class T_56 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int num = s.nextInt();
			StringBuilder answer = new StringBuilder();
			if (num == 1) {
				System.out.println(0);
				continue;
			}

			if (num % 2 == 0) {
				for (int i = 0; i < num / 2; i++) {
					answer.append('8');
				}
				System.out.println(answer.toString());
			} else {
				answer.append('4');
				for (int i = 1; i < num / 2; i++) {
					answer.append('8');
				}
				System.out.println(answer.toString());
			}
		}
	}

}
