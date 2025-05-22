package java_algorithm_study;

import java.util.Scanner;

public class Algo_39 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int H = s.nextInt();
		int W = s.nextInt();
		int[] height = new int[W];

		for (int i = 0; i < W; i++) {
			height[i] = s.nextInt();
		}

		int[] leftMax = new int[W];
		int[] rightMax = new int[W];

		leftMax[0] = height[0];
		for (int i = 1; i < W; i++) {
			leftMax[i] = Math.max(leftMax[i - 1], height[i]);
		}

		rightMax[W-1] = height[W-1];
		for (int i = W - 2; i >= 0; i--) {
			rightMax[i] = Math.max(rightMax[i + 1], height[i]);
		}

		int result = 0;
		for (int i = 1; i < W - 1; i++) {
			int water = Math.min(leftMax[i], rightMax[i]) - height[i];
			if (water > 0) {
				result += water;
			}
		}

		System.out.println(result);
	}
	//BJ14719
}
