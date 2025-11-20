package codingTest;

import java.util.*;

public class T_68 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		for (int tc = 0; tc < t; tc++) {
			String commands = s.next();
			char[] ch = commands.toCharArray();

			//?->L
			int dist1 = 0, max1 = 0;
			for (char c : ch) {
				if (c == 'L')
					dist1--;
				else if (c == 'R')
					dist1++;
				else
					dist1--;
				max1 = Math.max(max1, Math.abs(dist1));
			}
			//?->R
			int dist2 = 0, max2 = 0;
			for (char c : ch) {
				if (c == 'L')
					dist2--;
				else if (c == 'R')
					dist2++;
				else
					dist2++; 
				max2 = Math.max(max2, Math.abs(dist2));
			}
			int answer = Math.max(max1, max2);
			System.out.println(answer);

		}

	}
	//SWEA 로봇언어 D3
}
