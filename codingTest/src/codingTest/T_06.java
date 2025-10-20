package codingTest;

import java.util.*;

public class T_06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int candy[] = new int[N];
		for (int i = 0; i < N; i++) {
			candy[i] = s.nextInt();
		}
		long a = 0;
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0)
				a += candy[i];
			else
				a -= candy[i];
		}
		int a0 = (int) (a / 2);

		int[] answer = new int[N];
		answer[0] = a0;
		for (int i = 1; i < N; i++) {
			answer[i] = candy[i - 1] - answer[i - 1];
		}

		for (int i = 0; i < N; i++)
			System.out.println(answer[i]);
	}
//BOJ S4 사탕 
}
