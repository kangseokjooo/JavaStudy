package java_algorithm_study;

import java.util.Scanner;

public class Algo_11 {
    static int[][] board = new int[5][5];
    static int dr[] = { -1, 1, 0, 0 };
    static int dc[] = { 0, 0, -1, 1 };
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = s.nextInt();
            }
        }
        int sr = s.nextInt();
        int sc = s.nextInt();

  
        int temp = board[sr][sc];
        board[sr][sc] = -1;

        dfs(sr, sc, 0, 0);

        board[sr][sc] = temp;

        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }

    static void dfs(int r, int c, int apple, int move) {
        if (apple == 3) {
            min = Math.min(min, move);
            return;
        }

        for (int d = 0; d < 4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr >= 0 && nr < 5 && nc >= 0 && nc < 5 && board[nr][nc] != -1) {
                int temp = board[nr][nc];

                board[nr][nc] = -1;  

                if (temp == 1) {
                    dfs(nr, nc, apple + 1, move + 1);
                } else {
                    dfs(nr, nc, apple, move + 1);
                }

                board[nr][nc] = temp; 
            }
        }
    }
    //26170(X 출발위치도 막자)
}
