package codingTest;


import java.util.*;

public class T_08 {
	static int N, M;
	static String[] words;
	static int base, extra, g;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		M = s.nextInt();

		words = new String[N];
		int curtotal = 0;
		for (int i = 0; i < N; i++) {
			words[i] = s.next();
			curtotal += words[i].length();
		}

		int underLine = M - curtotal;
		g = N - 1;

		base = underLine / g;
		extra = underLine % g;

		String best = null;

	
		for (int mask = 0; mask < (1 << g); mask++) {
			if (Integer.bitCount(mask) != extra)
				continue;

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < N; i++) {
				sb.append(words[i]);
				if (i < g) {
					int add = base + (((mask & (1 << i)) != 0) ? 1 : 0);
					for (int k = 0; k < add; k++)
						sb.append('_');
				}
			}
			String cand = sb.toString();
			if (best == null || compare(cand, best) < 0) {
				best = cand;
			}
		}

		System.out.println(best);
	}

	
	static int compare(String a, String b) {
		int n = Math.min(a.length(), b.length());
		for (int i = 0; i < n; i++) {
			int va = order(a.charAt(i));
			int vb = order(b.charAt(i));
			if (va != vb)
				return va - vb;
		}
		return a.length() - b.length();
	}

	static int order(char c) {
		if ('A' <= c && c <= 'Z')
			return c - 'A'; 
		if (c == '_')
			return 26;
		if ('a' <= c && c <= 'z')
			return 27 + (c - 'a'); 
		return 1000; 
	}

	// BOJ S1 밑 줄(X)

}
