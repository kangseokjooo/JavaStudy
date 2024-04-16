package java_algorithm_study;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day40_2 {
    static int N; 
    static int M;
    static int r;
    static int c;
    static int d;
    static int cnt=0;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        N = s.nextInt();
        M = s.nextInt();
        r = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
            	map[i][j] = s.nextInt();
            }
        }

        bfs(r, c, d);
        System.out.println(cnt);
    }

    static void bfs(int r, int c, int d) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r, c, d});
        visited[r][c] = true;
        cnt++;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dir = current[2];
            boolean canM = false;
            for (int k = 0; k < 4; k++) {
                dir = (dir + 3) % 4; //반시계 방향으로 돌기 
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (0 <= nx && nx < N && 0 <= ny && ny < M && map[nx][ny] == 0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, dir});
                    cnt++;
                    canM = true;
                    break;
                }
            }

            if (!canM) {
                int nx = x - dx[dir]; //반시계방향으로 돈방향 그대로 뒤로 후진 
                int ny = y - dy[dir];
                if (0 <= nx && nx < N && 0 <= ny && ny < M && map[nx][ny] != 1) {
                    queue.offer(new int[]{nx, ny, dir});
                } else {
                    return;
                }
            }
        }
    }
}
