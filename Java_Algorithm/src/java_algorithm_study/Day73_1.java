package java_algorithm_study;

import java.util.*;

public class Day73_1 {
	static Map<Character, Set<Character>> graph = new HashMap<Character, Set<Character>>();

	public static boolean bfs(char start, char end) {
		if (start == end)
			return true;

		Queue<Character> q = new LinkedList<Character>();
		Set<Character> visited = new HashSet<Character>();

		q.offer(start);
		visited.add(start);

		while (!q.isEmpty()) {
			char cur = q.poll();
			if (graph.containsKey(cur)) {
				for (char n : graph.get(cur)) {
					if (n == end)
						return true;
					if (!visited.contains(n)) {
						visited.add(n);
						q.add(n);
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		s.nextLine();

		for (int i = 0; i < n; i++) {
			String str = s.nextLine();
			char a = str.charAt(0);
			char b = str.charAt(5);

			graph.putIfAbsent(a, new HashSet<>());
			graph.get(a).add(b);
		}
		
		int m = s.nextInt();
		s.nextLine();
		for (int i = 0; i < m; i++) {
			String str = s.nextLine();
			char a = str.charAt(0);
			char b = str.charAt(5);

			if (bfs(a, b)) {
				System.out.println("T");
			} else {
				System.out.println("F");
			}
		}
	}
//BJ15723
}
