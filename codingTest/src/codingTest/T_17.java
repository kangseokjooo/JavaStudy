package codingTest;

import java.util.*;

public class T_17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int A = s.nextInt();
		int B = s.nextInt();

		long[] arr = new long[N];
		int[][] pos = new int[N][2];

		for (int i = 0; i < N; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			pos[i][0] = x;
			pos[i][1] = y;
			arr[i] = encode(x, y);
		}

		Arrays.sort(arr);

		long answer = 0;
		for (int i = 0; i < N; i++) {
			int x = pos[i][0];
			int y = pos[i][1];

			if (exist(arr, encode(x + A, y)) && exist(arr, encode(x, y + B)) && exist(arr, encode(x + A, y + B))) {
				answer++;
			}
		}

		System.out.println(answer);
	}

	static boolean exist(long[] arr, long key) {
		int idx = Arrays.binarySearch(arr, key);
		return idx >= 0;
	}

	static long encode(int x, int y) {
		return (((long) x) << 32) ^ (y & 0xffffffffL);
	}
	
	//BOJ 넷이 놀기 
}
