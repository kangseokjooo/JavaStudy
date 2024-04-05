package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day34_1 {
    static int N;
    static boolean[][] visited;
    static char[][] picture;

    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        N = s.nextInt();
        s.nextLine();

        picture = new char[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String line = s.nextLine();
            for (int j = 0; j < N; j++) {
                picture[i][j] = line.charAt(j);
            }
        }
        int normal = cntA(false);
        int blind = cntA(true);

        System.out.println(normal + " " + blind);
    }

    static int cntA(boolean isBlinded) {
        int cnt = 0;
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, isBlinded);
                    cnt++;
                }
            }
        }

        return cnt;
    }

    static void bfs(int x, int y, boolean isBlinded) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;
        char cC = picture[x][y];
        while (!q.isEmpty()) {
            int current[] = q.poll();
            int cX = current[0];
            int cY = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = cX + dx[i];
                int ny = cY + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny]) {
                    char next = picture[nx][ny];
                    if (!isBlinded) {
                        if (cC == next) {
                            visited[nx][ny] = true;
                            q.offer(new int[]{nx, ny});
                        }
                    } else {
                        if (cC == next || (cC == 'R' && next == 'G') || (cC == 'G' && next == 'R')) {
                            visited[nx][ny] = true;
                            q.offer(new int[]{nx, ny});
                        }
                    }
                }
            }
        }
    }
}
