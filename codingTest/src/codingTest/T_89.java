package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class T_89 {
	static String[] arr;
	static int L, C;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		L = s.nextInt();
		C = s.nextInt();

		arr = new String[C];

		for (int i = 0; i < C; i++)
			arr[i] = s.next();

		Arrays.sort(arr);

		comb(0, 0, "");
	}

	static void comb(int idx, int cnt, String sum) {
		if (cnt == L) {
			if (isValid(sum)) {
				System.out.println(sum);
			}
			return;
		}

		for (int i = idx; i < arr.length; i++) {
			//중복 제거 
			comb(i + 1, cnt + 1, sum + arr[i]);

		}
	}
	//최소 한 개의 모음(a, e, i, o, u)과 최소 두 개의 자음 
	static boolean isValid(String str) {
		int a = 0, b = 0;
		for (char c : str.toCharArray()) {
			if ("aeiou".indexOf(c) != -1)
				a++;
			else
				b++;
		}
		return a >= 1 && b >= 2;
	}
	//암호 만들기 BOJ G5
}
