package java_algorithm_study;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Algorithm_14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		s.nextLine();

		List<BigInteger> numbers = new ArrayList<BigInteger>();

		for (int i = 0; i < N; i++) {
			String row = s.nextLine().trim();
			StringBuilder sb = new StringBuilder();

			for (char ch : row.toCharArray()) {
				if (Character.isDigit(ch)) {
					sb.append(ch);
				} else {
					if (sb.length() > 0) {
						numbers.add(new BigInteger(sb.toString()));
						sb.setLength(0);
					}
				}
			}
			if (sb.length() > 0) {
				numbers.add(new BigInteger(sb.toString()));
			}
		}
		Collections.sort(numbers);

		for (BigInteger n : numbers) {
			System.out.println(n);
		}
	}
}
