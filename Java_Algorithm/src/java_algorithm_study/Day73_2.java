package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day73_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		s.nextLine();

		String sN[] = new String[n];

		for (int i = 0; i < n; i++) {
			sN[i] = s.nextLine();
		}

		int length = sN[0].length();

		for (int k = 1; k <= length; k++) {
			Set<String> set = new HashSet<String>();
			boolean flag = true;

			for (String str : sN) {
				String number = str.substring(length - k);
				if (set.contains(number)) {
					flag = false;
					break;
				}
				set.add(number);
			}
			if (flag) {
				System.out.println(k);
				break;
			}
		}
	}
	// BJ1235

}
