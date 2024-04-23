package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day45_1 {
    static int N, M;
    static char map[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static int maxDistance; // 최대 거리

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        M = s.nextInt();
        map = new char[N][M];

        // 입력 받기
        for (int i = 0; i < N; i++) {
            String row = s.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = row.charAt(j);
            }
        }

        maxDistance = 0; // 초기 최대 거리는 0으로 설정

        // 모든 육지에서 시작하여 최대 거리 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'L') {
                    maxDistance = Math.max(maxDistance, bfs(i, j));
                }
            }
        }

        System.out.println(maxDistance);
    }

    // BFS를 통해 육지로부터의 최대 거리 계산
    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[N][M]; // 방문 여부 배열
        int[][] distance = new int[N][M]; // 해당 위치까지의 거리

        q.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && map[nx][ny] == 'L') {
                    q.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    distance[nx][ny] = distance[curX][curY] + 1; // 이전 위치까지의 거리 + 1
                }
            }
        }

        // 해당 육지에서의 최대 거리 찾기
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                max = Math.max(max, distance[i][j]);
            }
        }

        return max;
    }
}
