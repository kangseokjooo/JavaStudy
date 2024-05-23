package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day54_2 {
    static int n;
    static int[][] map;
    static int[][]visited;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int t = 1; t <= T; t++) {
            n = s.nextInt();

            map = new int[n][n];
            visited = new int[n][n];

            for (int i = 0; i < n; i++) {
                String row = s.next();
                for (int j = 0; j < n; j++) {
                    map[i][j] = row.charAt(j) - '0';
                    visited[i][j] = Integer.MAX_VALUE;
                }
            }

            int result = bfs();
            System.out.println("#" + t + " " + result);
        }
        s.close();
    }

    static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { 0, 0 });
        visited[0][0] = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isValid(nx, ny)) {
                    int newCost = visited[x][y] + map[nx][ny];
                    if (newCost < visited[nx][ny]) {
                    	visited[nx][ny] = newCost;
                        q.offer(new int[] { nx, ny });
                    }
                }
            }
        }

        return visited[n - 1][n - 1];
    }

    static boolean isValid(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}
