package codingTest;

import java.util.*;

public class T_90 {
	static int[][] Jsum, Osum, Isum;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int M = s.nextInt();
		int N = s.nextInt();

		int K = s.nextInt();

		char map[][] = new char[M + 1][N + 1];

		for (int i = 1; i <= M; i++) {
			String row = s.next();
			for (int j = 1; j <= N; j++) {
				map[i][j] = row.charAt(j - 1);
			}
		}
		Jsum = new int[M + 1][N + 1];
		Osum = new int[M + 1][N + 1];
		Isum = new int[M + 1][N + 1];
		
		// 테이블 : 위,왼쪽 사각형 빼주기 
		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				Jsum[i][j] = Jsum[i - 1][j] + Jsum[i][j - 1] - Jsum[i - 1][j - 1] + (map[i][j] == 'J' ? 1 : 0);
				Osum[i][j] = Osum[i - 1][j] + Osum[i][j - 1] - Osum[i - 1][j - 1] + (map[i][j] == 'O' ? 1 : 0);
				Isum[i][j] = Isum[i - 1][j] + Isum[i][j - 1] - Isum[i - 1][j - 1] + (map[i][j] == 'I' ? 1 : 0);
			}
		}
		

		for (int i = 0; i < K; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			findJOI(a, b, c, d);
		}

	}

	static void findJOI(int x1, int y1, int x2, int y2) {
		
		// 전체 사각형 빼기 위쪽,왼쪽 +겹쳐서 뺀 부분 더하기 
		int Jcnt = Jsum[x2][y2] - Jsum[x1 - 1][y2] - Jsum[x2][y1 - 1] + Jsum[x1 - 1][y1 - 1];
		int Ocnt = Osum[x2][y2] - Osum[x1 - 1][y2] - Osum[x2][y1 - 1] + Osum[x1 - 1][y1 - 1];
		int Icnt = Isum[x2][y2] - Isum[x1 - 1][y2] - Isum[x2][y1 - 1] + Isum[x1 - 1][y1 - 1];
		
		System.out.println(Jcnt+" "+Ocnt+" "+Icnt);
	}
	
	//BOJ 행성 탐사 G5 누적합 활용 

}
//for (int i = 1; i <= length - k; i++) {
//    for (int j = 1; j <= length - k; j++) {
//         sum[i][j] = A[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
//    }
//}
