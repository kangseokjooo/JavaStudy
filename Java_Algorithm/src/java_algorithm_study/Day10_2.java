package java_algorithm_study;

import java.util.Scanner;

public class Day10_2 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        int N = scanner.nextInt(); // 집의 개수
	        
	        // 각 집을 빨강, 초록, 파랑으로 칠하는 비용을 저장하는 배열
	        int[][] cost = new int[N][3];
	        
	        // 각 집을 빨강, 초록, 파랑으로 칠하는 비용 입력
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < 3; j++) {
	                cost[i][j] = scanner.nextInt();
	            }
	        }
	        
	        // 다이나믹 프로그래밍을 통해 최소 비용 계산
	        int minCost = minCostToPaint(N, cost);
	        
	        System.out.println(minCost);
	}
	private static int minCostToPaint(int N, int[][] cost) {
        int[][] dp = new int[N][3]; // 다이나믹 프로그래밍을 위한 배열
        
        // 첫 번째 집의 비용은 초기화
        for (int i = 0; i < 3; i++) {
            dp[0][i] = cost[0][i];
        }
        
        // 두 번째 집부터 마지막 집까지 각 집에 대해 최소 비용 계산
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2];
        }
        
        // 마지막 집의 칠하는 비용 중 최솟값 반환
        return Math.min(Math.min(dp[N - 1][0], dp[N - 1][1]), dp[N - 1][2]);
    }

}
