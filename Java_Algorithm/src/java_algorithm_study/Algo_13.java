package java_algorithm_study;

import java.util.*;

public class Algo_13 {
    static int H, W;
    static char[][] grid;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        while (T-- > 0) {
            H = s.nextInt();
            W = s.nextInt();
            s.nextLine(); 
            grid = new char[H][W];
            visited = new boolean[H][W];

            for (int i = 0; i < H; i++) {
                grid[i] = s.nextLine().toCharArray();
            }

            int count = 0;

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (grid[i][j] == '#' && !visited[i][j]) {
                        bfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    static void bfs(int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r, c});
        visited[r][c] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cr = cur[0], cc = cur[1];

            for (int d = 0; d < 4; d++) {
                int nr = cr + dr[d];
                int nc = cc + dc[d];

                if (nr >= 0 && nr < H && nc >= 0 && nc < W) {
                    if (grid[nr][nc] == '#' && !visited[nr][nc]) {
                        visited[nr][nc] = true;
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
        }
    }
    //BJ11123(O)
}
