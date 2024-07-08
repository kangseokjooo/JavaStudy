package java_algorithm_study;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Day78_4 {

    static class Point {
        int l, r, c;
        int minutes;

        public Point(int l, int r, int c, int minutes) {
            this.l = l;
            this.r = r;
            this.c = c;
            this.minutes = minutes;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int L = s.nextInt();
            int R = s.nextInt();
            int C = s.nextInt();
            s.nextLine();

            if (L == 0 && R == 0 && C == 0) break;

            char[][][] b = new char[L][R][C];
            Point start = null;
            Point end = null;

            for (int l = 0; l < L; l++) {
                for (int r = 0; r < R; r++) {
                    String line = s.nextLine();
                    for (int c = 0; c < C; c++) {
                        b[l][r][c] = line.charAt(c);
                        if (b[l][r][c] == 'S') {
                            start = new Point(l, r, c, 0);
                        } else if (b[l][r][c] == 'E') {
                            end = new Point(l, r, c, 0);
                        }
                    }
                }
                if (l < L - 1) 
                    s.nextLine();
            }


            int et = bfs(b, start, end);

            if (et == -1) {
                System.out.println("Trapped!");
            } else {
                System.out.printf("Escaped in %d minute(s).\n", et);
            }
        }

        s.close();
    }

    private static int bfs(char[][][] building, Point start, Point end) {
        int L = building.length;
        int R = building[0].length;
        int C = building[0][0].length;

        boolean[][][] visited = new boolean[L][R][C];
        Queue<Point> queue = new ArrayDeque<>();
        queue.offer(start);
        visited[start.l][start.r][start.c] = true;

        int[] dl = {-1, 1, 0, 0, 0, 0};
        int[] dr = {0, 0, -1, 1, 0, 0};
        int[] dc = {0, 0, 0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Point cur = queue.poll();

            for (int i = 0; i < 6; i++) {
                int nl = cur.l + dl[i];
                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];

                if (nl >= 0 && nl < L && nr >= 0 && nr < R && nc >= 0 && nc < C &&
                    !visited[nl][nr][nc] && building[nl][nr][nc] != '#') {
                    if (nl == end.l && nr == end.r && nc == end.c) {
                        return cur.minutes + 1;
                    }
                    queue.offer(new Point(nl, nr, nc, cur.minutes + 1));
                    visited[nl][nr][nc] = true;
                }
            }
        }

        return -1; 
    }
    //BJ6593
}
