package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day46_1 {
    static int N, M;
    static int map[][];
    static boolean visited[][];
    static int dx[] = {-1, 1, 0, 0, -1, -1, 1, 1}; 
    static int dy[] = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        M = s.nextInt();
        map = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = s.nextInt();
            }
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && bfs(i, j)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    static boolean bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;
        boolean peak = true;

        while (!q.isEmpty()) {
            int cur[] = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 8; i++) { 
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (map[nx][ny] > map[curX][curY]) { 
                        peak = false;
                    }
                    if (!visited[nx][ny] && map[nx][ny] == map[curX][curY]) {
                        q.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return peak;
    }
}
