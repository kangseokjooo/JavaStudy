package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day56_1 {
    static int R, C;
    static boolean visited[][];
    static char map[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        R = s.nextInt();
        C = s.nextInt();
        s.nextLine();  
        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            map[i] = s.nextLine().toCharArray();
        }

        int ts = 0, tw = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visited[i][j] && map[i][j] != '#') {
                    int[] result = bfs(i, j);
                    int sh = result[0];
                    int w = result[1];

                    if (sh > w) {
                    	ts += sh;
                    } else {
                    	tw += w;
                    }
                }
            }
        }

        System.out.println(ts + " " + tw);
    }

    static int[] bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;

        int scnt = 0;
        int wcnt = 0;

        if (map[x][y] == 'k') scnt++;
        if (map[x][y] == 'v') wcnt++;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int curX = current[0];
            int curY = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[nx][ny] && map[nx][ny] != '#') {
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny});

                    if (map[nx][ny] == 'k') scnt++;
                    if (map[nx][ny] == 'v') wcnt++;
                }
            }
        }

        return new int[]{scnt, wcnt};
    }
}
