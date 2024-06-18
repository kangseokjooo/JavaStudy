package java_algorithm_study;

import java.util.Scanner;

public class Day69_1 {
    static int k;
    static int[] S;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            k = s.nextInt();
            if (k == 0) break;

            S = new int[k];
            visited = new boolean[k];

            for (int i = 0; i < k; i++) {
                S[i] = s.nextInt();
            }

            dfs(0, 0);
            System.out.println();
        }
        s.close();
    }

    public static void dfs(int start, int depth) {
        if (depth == 6) {
            for (int i = 0; i < k; i++) {
                if (visited[i]) {
                    System.out.print(S[i] + " ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = start; i < k; i++) {
            visited[i] = true;
            dfs(i + 1, depth + 1);
            visited[i] = false;
        }
    }
}
