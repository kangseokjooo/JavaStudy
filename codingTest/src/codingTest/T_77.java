package codingTest;

import java.util.*;

public class T_77 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		for (int tc = 0; tc < t; tc++) {
			String str = s.next();
			int cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'o') {
					cnt++;
				}
			}
			int remain = 15 - str.length();

			if (cnt + remain >= 8) {
				System.out.println("#" + (tc + 1) + " YES");
			} else {
				System.out.println("#" + (tc + 1) + " NO");
			}
		}
	}
	//SWEA S3 팔씨름 

}
