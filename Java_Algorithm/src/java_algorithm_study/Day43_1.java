package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day43_1 {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
        	String row=s.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = row.charAt(j)-'0';
            }
        }
        
        ArrayList<Integer> com = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    com.add(bfs(i, j));
                }
            }

        }
        Collections.sort(com);
        System.out.println(com.size());
        
        for (int n : com) {
            System.out.println(n);
        }

    }

    static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<int[]>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;
        int cnt = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            for (int i = 0; i < 4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N && map[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    q.offer(new int[]{nextX, nextY});
                    visited[nextX][nextY] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
