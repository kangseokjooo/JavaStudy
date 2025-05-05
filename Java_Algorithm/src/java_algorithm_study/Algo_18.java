package java_algorithm_study;

import java.util.Scanner;

public class Algo_18 {
    static int n, m;
    static int[][] paper;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; 
    static int[] dy = {0, 0, -1, 1};
    static int area;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();

        paper = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                paper[i][j] = s.nextInt();
            }
        }

        int pcnt = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (paper[i][j] == 1 && !visited[i][j]) {
                    area = 0;
                    dfs(i, j);
                    pcnt++;
                    max = Math.max(max, area);
                }
            }
        }

        System.out.println(pcnt);
        System.out.println(max);
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        area++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (!visited[nx][ny] && paper[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }
    //BJ1926
}
