package java_algorithm_study;

import java.util.*;

public class Day62_1 {
    static int M, N;
    static int[][] painting;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        M = s.nextInt();
        N = s.nextInt();
        painting = new int[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                painting[i][j] = s.nextInt();
            }
        }

        int number = 0;
        int max = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (painting[i][j] == 1 && !visited[i][j]) {
                    int area = bfs(i, j);
                    max = Math.max(max, area);
                    number++;
                }
            }
        }

        System.out.println(number);
        System.out.println(max);
    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        int area = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            area++;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && painting[nx][ny] == 1) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }

        return area;
    }
}
