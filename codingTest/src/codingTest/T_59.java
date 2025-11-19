package codingTest;

import java.util.*;

public class T_59 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		for (int tc = 1; tc <= t; tc++) {
			int n = s.nextInt();
			System.out.println("#" + tc);

			StringBuilder answer = new StringBuilder();
			for (int i = 0; i < n; i++) {
				String str = s.next();
				int num = s.nextInt();

				for (int j = 0; j < num; j++) {
					answer.append(str);
				}

			}
			for(int i=0;i<answer.length();i++) {
				System.out.print(answer.charAt(i));
				if((i+1)%10==0) {
					System.out.println();
				}
			}
			System.out.println();
		}
	}

}
