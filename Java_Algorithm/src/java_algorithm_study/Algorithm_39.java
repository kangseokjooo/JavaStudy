package java_algorithm_study;

import java.util.Stack;
import java.util.HashMap;
import java.util.Scanner;

public class Algorithm_39 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		HashMap<Character, Integer> atom = new HashMap<>();
		atom.put('H', 1);
		atom.put('C', 12);
		atom.put('O', 16);

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (atom.containsKey(ch)) {
				st.push(atom.get(ch));
			}

			else if (ch == '(') {
				st.push((int) ch);
			}

			else if (ch == ')') {
				int temp = 0;

				while (true) {
					int p = st.pop();
					if (p == (int) '(') {
						break;
					}
					temp += p;
				}

				if (temp == 0) {
					continue;
				} else {
					st.push(temp);
				}
			}

			else {
				int n = st.pop();
				int temp = n * Character.getNumericValue(ch);
				st.push(temp);
			}
		}

		int result = 0;
		while (!st.isEmpty()) {
			result += st.pop();
		}

		System.out.println(result);
	}
	//BJ2257(X)
}
