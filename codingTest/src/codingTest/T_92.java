package codingTest;

import java.util.*;

public class T_92 {
    static int N, M;
    static int[][] map;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        N = s.nextInt();
        M = s.nextInt();

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = s.nextInt();
            }
        }
        int answer = tetromino();
        System.out.println(answer);
    }

    static int tetromino() {
        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                // 1) ㅡ 
                if (j + 3 < M) {
                    int t = map[i][j] + map[i][j+1] + map[i][j+2] + map[i][j+3];
                    if (answer < t) answer = t;
                }

                // 2) ㅣ 
                if (i + 3 < N) {
                    int t = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+3][j];
                    if (answer < t) answer = t;
                }

                // 3) ㅁ 
                if (i + 1 < N && j + 1 < M) {
                    int t = map[i][j] + map[i][j+1] + map[i+1][j] + map[i+1][j+1];
                    if (answer < t) answer = t;
                }

                // L/J
                if (i + 2 < N && j + 1 < M) {
                    int t = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+2][j+1]; // L
                    if (answer < t) answer = t;
                }

                if (i + 2 < N && j + 1 < M) {
                    int t = map[i][j+1] + map[i+1][j+1] + map[i+2][j+1] + map[i+2][j]; // J
                    if (answer < t) answer = t;
                }

                if (i + 2 < N && j + 1 < M) {
                    int t = map[i][j] + map[i][j+1] + map[i+1][j+1] + map[i+2][j+1]; // ㄴ
                    if (answer < t) answer = t;
                }

                if (i + 2 < N && j + 1 < M) {
                    int t = map[i][j] + map[i+1][j] + map[i+2][j] + map[i][j+1]; // ┘
                    if (answer < t) answer = t;
                }

                if (i + 1 < N && j + 2 < M) {
                    int t = map[i][j] + map[i+1][j] + map[i+1][j+1] + map[i+1][j+2]; // L 가로
                    if (answer < t) answer = t;
                }

                if (i + 1 < N && j + 2 < M) {
                    int t = map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j+2]; // J 가로
                    if (answer < t) answer = t;
                }

                if (i + 1 < N && j + 2 < M) {
                    int t = map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j]; // ㄴ 가로
                    if (answer < t) answer = t;
                }

                if (i + 1 < N && j + 2 < M) {
                    int t = map[i+1][j] + map[i+1][j+1] + map[i+1][j+2] + map[i][j+2]; // ┘ 가로
                    if (answer < t) answer = t;
                }

                // S/Z 
                if (i + 1 < N && j + 2 < M) {
                    int t = map[i][j] + map[i][j+1] + map[i+1][j+1] + map[i+1][j+2]; // S 가로
                    if (answer < t) answer = t;
                }

                if (i + 1 < N && j + 2 < M) {
                    int t = map[i+1][j] + map[i+1][j+1] + map[i][j+1] + map[i][j+2]; // Z 가로
                    if (answer < t) answer = t;
                }

                if (i + 2 < N && j + 1 < M) {
                    int t = map[i][j] + map[i+1][j] + map[i+1][j+1] + map[i+2][j+1]; // S 세로
                    if (answer < t) answer = t;
                }

                if (i + 2 < N && j + 1 < M) {
                    int t = map[i+1][j] + map[i+2][j] + map[i][j+1] + map[i+1][j+1]; // Z 세로
                    if (answer < t) answer = t;
                }

                //  ㅗ 모양
                if (i + 1 < N && j + 2 < M) {
                    int t = map[i][j] + map[i][j+1] + map[i][j+2] + map[i+1][j+1]; // ㅗ
                    if (answer < t) answer = t;
                }

                if (i + 1 < N && j + 2 < M) {
                    int t = map[i+1][j] + map[i+1][j+1] + map[i+1][j+2] + map[i][j+1]; // ㅜ
                    if (answer < t) answer = t;
                }

                if (i + 2 < N && j + 1 < M) {
                    int t = map[i][j] + map[i+1][j] + map[i+2][j] + map[i+1][j+1]; // ㅓ
                    if (answer < t) answer = t;
                }

                if (i + 2 < N && j + 1 < M) {
                    int t = map[i][j+1] + map[i+1][j+1] + map[i+2][j+1] + map[i+1][j]; // ㅏ
                    if (answer < t) answer = t;
                }

            }
        }

        return answer;
    }
    //BOJ 테트로미노 G4 (o)
}
