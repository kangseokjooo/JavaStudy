package java_algorithm_study;

import java.util.ArrayList;
import java.util.Scanner;

public class Day105_1 {
    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    static int total = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        tree = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            tree[a].add(b);
            tree[b].add(a);
        }

  
        visited[1] = true;
        dfs(1, 0);

        if (total % 2 == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void dfs(int node, int depth) {
        boolean isLeaf = true;

        for (int c : tree[node]) {
            if (!visited[c]) {
                isLeaf = false;
                visited[c] = true;
                dfs(c, depth + 1);
            }
        }


        if (isLeaf) {
            total += depth;
        }
    }
    //BJ15900(X->BufferedReader,Writer)
}
