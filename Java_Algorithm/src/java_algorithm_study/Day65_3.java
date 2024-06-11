package java_algorithm_study;

import java.util.Scanner;

public class Day65_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println(ddddd(arr));
	}

	static String ddddd(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return "Blue";
				}
			}
		}
		return "Red";
	}
}
