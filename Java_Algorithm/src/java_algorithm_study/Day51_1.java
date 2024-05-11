package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day51_1 {
    static char[][] map;
    static boolean visited[][];
    static int N, M;
    static int[] dx = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt(); 
        M = s.nextInt(); 
        s.nextLine();
        map = new char[N][M]; 
        visited = new boolean[N][M]; 
        for (int i = 0; i < N; i++) { 
            String row = s.nextLine();
            for (int j = 0; j < M; j++) { 
                map[i][j] = row.charAt(j);
            }
        }
        int mp = 0;
        int ep = 0;
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < M; j++) { 
                if (!visited[i][j]) {
                    int p = bfs(i, j);
                    if (map[i][j] == 'W') {
                        mp += p * p;
                    } else {
                        ep += p * p;
                    }
                }
            }
        }
        System.out.println(mp + " " + ep);
    }

    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[] { x, y });
        visited[x][y] = true;
        int cnt = 1;
        while (!q.isEmpty()) {
            int cur[] = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                if (nx >= 0 && nx < M && ny < N && ny >= 0 && !visited[nx][ny] && map[nx][ny] == map[x][y]) {
                    q.offer(new int[] { nx, ny });
                    visited[nx][ny] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
