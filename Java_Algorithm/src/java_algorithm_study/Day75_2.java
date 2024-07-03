package java_algorithm_study;

import java.util.Scanner;

public class Day75_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		int[] H = new int[N];

		for (int i = 0; i < N; i++) {
			H[i] = s.nextInt();
		}

		int result = 0;

		for (int i = 0; i < N; i++) {
			int tmp = N - 1;

			for (int j = i + 1; j < N; j++) {
                for (int k = i + 1; k < j; k++) {
                    if (H[k] - H[i] >= (((double)(H[j] - H[i]) / (j - i)) * (k - i))) {
                        tmp -= 1;
                        break;
                    }
                }
            }
			for (int j = 0; j < i; j++) {
				for (int k = j + 1; k < i; k++) {
					if (H[k] - H[j] >= (((double) (H[i] - H[j]) / (i - j)) * (k - j))) {
						tmp -= 1;
						break;
					}
				}
			}
			result=Math.max(tmp, result);
		}
		System.out.println(result);
	}
	//BJ1027
}
