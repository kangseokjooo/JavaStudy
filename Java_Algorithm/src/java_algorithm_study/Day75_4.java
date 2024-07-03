package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day75_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.nextLine();
		String[] top = new String[N];
		for (int i = 0; i < N; i++) {
			top[i] = s.next();
		}
		Set<String> topset = new HashSet<String>();

		for (String t : top) {
			if (t.endsWith("Cheese")) {
				topset.add(t);
			}
		}
		if (topset.size() >= 4) {
			System.out.println("yummy");
		} else {
			System.out.println("sad");
		}
	}
	// BJ27964
}
