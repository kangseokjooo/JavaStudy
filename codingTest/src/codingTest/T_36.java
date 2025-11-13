package codingTest;

import java.util.*;

public class T_36 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();

		for (int i = n; i <= m; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	static boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num == 2 || num == 3)
			return true;
		if (num % 2 == 0)
			return false;

		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	//BOJ S3 소수구하기 

}
