package java_algorithm_study;

import java.util.Scanner;

public class Day74_1 {
    static char map[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static int R, C;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        R = s.nextInt();
        C = s.nextInt();
        map = new char[R][C];
        for (int i = 0; i < R; i++) {
            String row = s.next();
            for (int j = 0; j < C; j++) {
                map[i][j] = row.charAt(j);
            }
        }
        boolean isEnd = false;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == '.') {
                    int walls = 0;

                    for (int d = 0; d < 4; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        if (nx < 0 || ny < 0 || nx >= R || ny >= C || map[nx][ny] == 'X') {
                            walls++;
                        }
                    }
                    if (walls >= 3) {
                        isEnd = true;
                    }
                }
            }
        }
        if (isEnd) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    //BJ2823
}
