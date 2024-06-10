package java_algorithm_study;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Day64_1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int C = s.nextInt();
		for (int i = 0; i < C; i++) {
			int S = s.nextInt();
			int T = s.nextInt();
			System.out.println(bfs(S, T));
		}
		s.close();
	}
	
	static int bfs(int S, int T) {
		Queue<int[]> q = new LinkedList<>();
		Set<String> visited = new HashSet<>();
		
		q.offer(new int[] {S, T, 0});
		visited.add(S + "," + T);
		
		int maxLimit = Math.max(S, T) * 3; 
		
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int s = cur[0];
			int t = cur[1];
			int kcnt = cur[2];
			
			if (s == t) {
				return kcnt;
			}
			
			
			int ns = s * 2;
			int nt = t + 3;
			if (ns <= maxLimit && nt <= maxLimit && !visited.contains(ns + "," + nt)) {
				q.offer(new int[] {ns, nt, kcnt + 1});
				visited.add(ns + "," + nt);
			}
			
	
			ns = s + 1;
			nt = t;
			if (ns <= maxLimit && nt <= maxLimit && !visited.contains(ns + "," + nt)) {
				q.offer(new int[] {ns, nt, kcnt + 1});
				visited.add(ns + "," + nt);
			}
		}
		
		return -1; 
	}
}
