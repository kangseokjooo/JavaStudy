package java_algorithm_study;

import java.util.*;

public class skdkks {
	static int M, A;
	static int[] dx = { 0, 0, 1, 0, -1 };
	static int[] dy = { 0, -1, 0, 1, 0 };
	static User userA, userB;
	static BC[] bc;

	public static class BC {
		int x, y, c, p;

		public BC(int x, int y, int c, int p) {
			this.x = x;
			this.y = y;
			this.c = c;
			this.p = p;
		}

		public boolean canCharge(User u) {
			int dis = Math.abs(this.x - u.x) + Math.abs(this.y - u.y);
			return dis <= this.c;
		}
	}

	public static class User {
		int x, y;

		public User(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public void move(int dir) {
			this.x += dx[dir];
			this.y += dy[dir];
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();

		for (int t = 1; t <= T; t++) {

			M = s.nextInt();
			A = s.nextInt();

			userA = new User(1, 1);
			userB = new User(10, 10);

			int[] movesA = new int[M + 1];
			int[] movesB = new int[M + 1];

			for (int i = 1; i <= M; i++) {
				movesA[i] = s.nextInt();
			}

			for (int i = 1; i <= M; i++) {
				movesB[i] = s.nextInt();
			}

			bc = new BC[A];
			for (int i = 0; i < A; i++) {
				int x = s.nextInt();
				int y = s.nextInt();
				int c = s.nextInt();
				int p = s.nextInt();
				bc[i] = new BC(x, y, c, p);
			}

			int total = 0;
			for (int i = 0; i <= M; i++) {

				userA.move(movesA[i]);
				userB.move(movesB[i]);
				
				total += MaxCharge();
			}

			System.out.println("#"+t+" "+total);
		}
		
	}

	public static int MaxCharge() {
		int max = 0;

		for (int i = 0; i < A; i++) {
			for (int j = 0; j < A; j++) {
				int cA = bc[i].canCharge(userA) ? bc[i].p : 0;
				int cB = bc[j].canCharge(userB) ? bc[j].p : 0;

				if (i == j && cA> 0&& cB>0) {
					max = Math.max(max,  cA/2+ cB/2);
				} else {
					max = Math.max(max, cA + cB);
				}
			}
		}

		return max;
	}
}
