package java_algorithm_study;

import java.util.*;

public class Day82_3 {
    static int M, N, K;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        M = s.nextInt();
        N = s.nextInt();
        K = s.nextInt();

        grid = new int[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < K; i++) {
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            int x2 = s.nextInt();
            int y2 = s.nextInt();

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    grid[y][x] = 1;
                }
            }
        }

        List<Integer> areas = new ArrayList<>();

        for (int y = 0; y < M; y++) {
            for (int x = 0; x < N; x++) {
                if (!visited[y][x] && grid[y][x] == 0) {
                    areas.add(bfs(y, x));
                }
            }
        }
        Collections.sort(areas);
        System.out.println(areas.size());
        for (int num : areas) {
            System.out.print(num + " ");
        }
        s.close();
    }

    static int bfs(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{y, x});
        visited[y][x] = true;

        int area = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cy = cur[0];
            int cx = cur[1];
            area++;

            for (int i = 0; i < 4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];

                if (ny >= 0 && ny < M && nx >= 0 && nx < N && !visited[ny][nx] && grid[ny][nx] == 0) {
                    visited[ny][nx] = true;
                    q.offer(new int[]{ny, nx});
                }
            }
        }
        return area;
    }
    //BJ2583
}
