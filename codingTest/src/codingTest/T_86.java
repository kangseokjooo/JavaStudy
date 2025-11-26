package codingTest;

import java.util.*;

public class T_86 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		for (int tc = 0; tc < t; tc++) {
			int n = s.nextInt();
			int R[] = new int[n];

			for (int i = 0; i < n; i++)
				R[i] = s.nextInt();
			boolean check[] = new boolean[n + 1];

			List<Integer> S = new ArrayList<Integer>();

			boolean flag = true;

			for (int i = 0; i < n; i++) {
				if (R[i] > i) {
					flag = false;
				}
			}

			if (!flag) {
				System.out.println("IMPOSSIBLE");
				continue;
			}

			for (int i = n - 1; i >= 0; i--) {

				int need = R[i] + 1;

				int cnt = 0;
				int pick = -1;

				for (int num = 1; num <= n; num++) {
					if (!check[num]) {
						cnt++;
						if (cnt == need) {
							pick = num;
							break;
						}
					}
				}
				if (pick == -1) {
					flag = false;
				}
				check[pick] = true;
				S.add(pick);
			}

			if (!flag) {
				System.out.println("IMPOSSIBLE");
				continue;
			}

			Collections.reverse(S);

			for (int x : S)
				System.out.print(x + " ");
			System.out.println();

		}

	}
	// BOJ 순서 G4

}
