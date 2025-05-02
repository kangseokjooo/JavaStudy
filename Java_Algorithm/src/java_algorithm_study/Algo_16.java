package java_algorithm_study;

import java.util.ArrayList;
import java.util.Scanner;

public class Algo_16 {
    static class Node {
        int to;
        int weight;

        Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static ArrayList<Node>[] graph;
    static boolean[] visited;
    static long max = 0; 

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int A = s.nextInt();
            int B = s.nextInt();
            int C = s.nextInt();
            graph[A].add(new Node(B, C));
            graph[B].add(new Node(A, C));
        }

        visited[1] = true;
        dfs(1, 0);

        System.out.println(max);
    }

    static void dfs(int cur, long dist) {
        max = Math.max(max, dist);

        for (Node n : graph[cur]) {
            if (!visited[n.to]) {
                visited[n.to] = true;
                dfs(n.to, dist + n.weight); // 누적 거리도 long으로 연산
            }
        }
    }
    //BJ18126
}
