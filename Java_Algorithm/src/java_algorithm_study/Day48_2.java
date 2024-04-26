package java_algorithm_study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day48_2 {
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            int A = s.nextInt();
            int B = s.nextInt();
            graph[A].add(B);
            graph[B].add(A);
        }
        int[] dis =bfs(N);

        int maxDis = 0; 
        int hide = 0;
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (dis[i] > maxDis) { 
                maxDis = dis[i];
                hide = i;
                cnt = 1;
            } else if (dis[i] == maxDis) {
                cnt++;
            }
        }
        System.out.println(hide + " " + maxDis + " " + cnt); 
    }

    static int[] bfs(int N) {
        Queue<Integer> q = new LinkedList<Integer>();
        int[] dis = new int[N + 1];
        boolean[] visited = new boolean[N + 1];

        q.offer(1);
        visited[1] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int n : graph[cur]) {
                if (!visited[n]) {
                    visited[n] = true;
                    q.offer(n);
                    dis[n] = dis[cur] + 1;
                }
            }
        }
        return dis;
    }
}
