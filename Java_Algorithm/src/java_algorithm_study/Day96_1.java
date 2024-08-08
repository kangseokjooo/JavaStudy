package java_algorithm_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day96_1 {
	static List<Integer>[] tree;
	static boolean[] delete;
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int[] p = new int[N];
		tree = new ArrayList[N];
		delete = new boolean[N];

		for (int i = 0; i < N; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		int root = -1;

		for (int i = 0; i < N; i++) {
			p[i] = s.nextInt();
			if (p[i] == -1) {
				root = i;
			} else {
				tree[p[i]].add(i);
			}
		}
		int delNode = s.nextInt();

		if (delNode == root) {
			System.out.println(0);
		} else {
			dfs1(delNode);
			dfs2(root);
			System.out.println(cnt);
		}
	}

	static void dfs1(int node) {
		delete[node] = true;
		for (int c : tree[node]) {
			if (!delete[c]) {
				dfs1(c);
			}
		}
	}

	static void dfs2(int node) {
		if (delete[node])
			return;

		if (tree[node].isEmpty()) {
			cnt++;
			return;
		}
		boolean isLeaf = true;
		for (int c : tree[node]) {
			if (!delete[c]) {
				isLeaf = false;
				dfs2(c);
			}
		}
		if (isLeaf) {
			cnt++;
		}
	}
	//BJ1068(X)
}
