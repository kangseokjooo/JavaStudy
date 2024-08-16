package java_algorithm_study;

import java.util.Scanner;

public class Day100_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int w = s.nextInt();
		int h = s.nextInt();

		int n = s.nextInt();

		int[] store = new int[n];

		for (int i = 0; i < n; i++) {
			int direction = s.nextInt();
			int distance = s.nextInt();

			store[i] = Distance(w, h, direction, distance);
		}
		int dgDir = s.nextInt();
		int dgDis = s.nextInt();
		int dsPo = Distance(w, h, dgDir, dgDis);

		int total = 0;
		int p = 2 * (w + h);

		for (int st : store) {
			int clock = Math.abs(dsPo - st);
			int unClock = p - clock;
			total += Math.min(clock, unClock);
		}
		System.out.println(total);
	}
	static int Distance(int w,int h,int direction,int distance) {
		switch (direction) {
		case 1: 
			return distance;
		case 2:
			return w+h+(w-distance);
		case 3:
			return 2*w+h+(h-distance);
		case 4:
			return w+distance;
		}
		return 0;
	}
	//BJ2564
}
