package java_algorithm_study;

import java.util.Scanner;

public class Day10_2 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        int N = scanner.nextInt();
	        
	        int[][] cost = new int[N][3];
	        
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < 3; j++) {
	                cost[i][j] = scanner.nextInt();
	            }
	        }
	        
	        int minCost = minCostToPaint(N, cost);
	        
	        System.out.println(minCost);
	}
	private static int minCostToPaint(int N, int[][] cost) {
        int[][] dp = new int[N][3]; 
        
        for (int i = 0; i < 3; i++) {
            dp[0][i] = cost[0][i];
        }
        
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2];
        }
        
        return Math.min(Math.min(dp[N - 1][0], dp[N - 1][1]), dp[N - 1][2]);
    }

}
