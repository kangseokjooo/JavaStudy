package java_algorithm_study;

import java.util.Scanner;

public class Day66_2 {
    static int N, M, tcnt, rcnt;
    static int[][] map;

    public static void dfs(int x, int y) {
        for (int i = x; i < N; i++) {
            for (int j = y; j < M; j++) {
                if (map[i][j] == 1) {
                    map[i][j] = 0;
                    tcnt--;
                    if (tcnt == 0) return;
                    dfs(i,j);
                    return; 
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = scanner.nextInt();
                if (map[i][j] == 1) tcnt++;
            }
        }

        while (tcnt > 0) {
            rcnt++;
            if (map[0][0] == 1) {
                map[0][0] = 0;
                tcnt--;
                if (tcnt == 0) break;
            }
            dfs(0, 0);
        }

        System.out.println(rcnt);
    }
}
