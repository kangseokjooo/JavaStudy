package java_algorithm_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day67_5 {
    static class Pos {
        int idx;
        int jumps;

        Pos(int idx, int jumps) {
            this.idx = idx;
            this.jumps = jumps;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] stone = new int[N];

        for (int i = 0; i < N; i++) {
            stone[i] = s.nextInt();
        }
        int a = s.nextInt() - 1;
        int b = s.nextInt() - 1;

        System.out.println(bfs(stone, a, b));
    }

    public static int bfs(int[] stone, int s, int e) {
        if (s == e) {
            return 0;
        }
        int N = stone.length;
        boolean[] visited = new boolean[N];
        Queue<Pos> q = new LinkedList<>();
        q.offer(new Pos(s, 0));
        visited[s] = true;

        while (!q.isEmpty()) {
            Pos cur = q.poll();

            int fIdx = cur.idx + stone[cur.idx];
            int bIdx = cur.idx - stone[cur.idx];

            while (fIdx < N) {
                if (!visited[fIdx]) {
                    if (fIdx == e) {
                        return cur.jumps + 1;
                    }
                    q.offer(new Pos(fIdx, cur.jumps + 1));
                    visited[fIdx] = true;
                }
                fIdx += stone[cur.idx];
            }

            while (bIdx >= 0) {
                if (!visited[bIdx]) {
                    if (bIdx == e) {
                        return cur.jumps + 1;
                    }
                    q.offer(new Pos(bIdx, cur.jumps + 1));
                    visited[bIdx] = true;
                }
                bIdx -= stone[cur.idx];
            }
        }
        return -1;
    }
    //BJ1326
}
