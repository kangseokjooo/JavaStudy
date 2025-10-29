package codingTest;

import java.util.*;

public class T_16 {
    static int m, n;
    static boolean visited[][];
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {-1, 1, 0, 0};
    static int map[][];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            m = s.nextInt();
            n = s.nextInt();
            int k = s.nextInt();

            map = new int[n][m];     
            visited = new boolean[n][m];

            for (int j = 0; j < k; j++) {
                int x = s.nextInt();
                int y = s.nextInt();
                map[y][x] = 1;       
            }

            int answer = 0;
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < m; b++) {
                    if (map[a][b] == 1 && !visited[a][b]) {
                        bfs(a, b);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }

    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = cx + dx[d];
                int ny = cy + dy[d];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
    //BOJ S2 유기농 배추(BFS)
}
