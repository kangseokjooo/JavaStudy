package java_algorithm_study;

import java.util.*;

public class Day57_4 {

    static class dis {
        int start, end, length;

        dis(int start, int end, int length) {
            this.start = start;
            this.end = end;
            this.length = length;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int D = s.nextInt();

        List<dis> li = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int start = s.nextInt();
            int end = s.nextInt();
            int length = s.nextInt();
            if (end <= D) {
            	li.add(new dis(start, end, length));
            }
        }

        System.out.println(bfs(N, D, li));
    }

    static int bfs(int N, int D, List<dis> edges) {
        int[] dist = new int[D + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (dis n : edges) {
                if (n.start == cur) {
                    if (dist[n.end] > dist[n.start] + n.length) {
                        dist[n.end] = dist[n.start] + n.length;
                        queue.offer(n.end);
                    }
                }
            }

            if (cur + 1 <= D) {
                if (dist[cur + 1] > dist[cur] + 1) {
                    dist[cur + 1] = dist[cur] + 1;
                    queue.offer(cur + 1);
                }
            }
        }

        return dist[D];
    }
}
