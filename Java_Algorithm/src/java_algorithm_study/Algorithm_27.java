package java_algorithm_study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algorithm_27 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    
        int n = Integer.parseInt(br.readLine());  
        String moves = br.readLine(); 

        boolean[][] arrh = new boolean[n][n];
        boolean[][] arrw = new boolean[n][n];

        int h = 0, w = 0;

        // 명령 처리
        for (char c : moves.toCharArray()) {
            if (c == 'U') { 
                if (h > 0) {
                    arrh[h][w] = true;
                    h--;
                    arrh[h][w] = true;
                }
            } else if (c == 'D') { 
                if (h < n - 1) {
                    arrh[h][w] = true;
                    h++;
                    arrh[h][w] = true;
                }
            } else if (c == 'L') {
                if (w > 0) {
                    arrw[h][w] = true;
                    w--;
                    arrw[h][w] = true;
                }
            } else if (c == 'R') { 
                if (w < n - 1) {
                    arrw[h][w] = true;
                    w++;
                    arrw[h][w] = true;
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!arrw[i][j] && !arrh[i][j]) {
                    System.out.print(".");
                } else if (!arrw[i][j] && arrh[i][j]) {
                    System.out.print("|");
                } else if (arrw[i][j] && !arrh[i][j]) {
                    System.out.print("-");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }

        br.close();
    }
}
