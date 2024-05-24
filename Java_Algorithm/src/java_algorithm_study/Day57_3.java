package java_algorithm_study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Day57_3 {
    static List<List<Integer>> graph;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        int M = scanner.nextInt(); 

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

     
        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph.get(x).add(y);
        }

        int minChange = bfs(N, 1);
        if (minChange == -1) {
            System.out.println(-1);
        } else {
            System.out.println(minChange);
        }
    }

    static int bfs(int N, int start) {
        Queue<Integer> queue = new LinkedList<>();
        int[] state = new int[N + 1];

        queue.offer(start);
        state[start] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph.get(current)) {
                if (state[next] == 0) { 
                    state[next] = state[current] + 1; 
                    queue.offer(next); 
                }
            }
        }

        if (state[N] == 0) { 
            return -1;
        } else {
            return state[N]; 
        }
    }
}
