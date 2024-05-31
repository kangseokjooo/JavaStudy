package java_algorithm_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Day61_1 {
    static int N, M;
    static int[][] map;
    static int[][] dist;
    static boolean[][] visited;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dimensions = br.readLine().split(" ");
        N = Integer.parseInt(dimensions[0]);
        M = Integer.parseInt(dimensions[1]);
        map = new int[N][M];
        dist = new int[N][M];
        visited = new boolean[N][M];

        int sX = -1;
        int sY = -1;

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(line[j]);
                if (map[i][j] == 2) {
                    sX = i;
                    sY = j;
                }
                if (map[i][j] == 0) {
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = -1;
                }
            }
        }
        bfs(sX, sY);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void bfs(int sX, int sY) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { sX, sY });
        visited[sX][sY] = true;
        dist[sX][sY] = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (isValid(nx, ny) && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    dist[nx][ny] = dist[cx][cy] + 1;
                    q.offer(new int[] { nx, ny });
                }
            }
        }
    }

    static boolean isValid(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < M && map[x][y] != 0;
    }
}
