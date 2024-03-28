package java_algorithm_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Day30_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] num = new int[N][N];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                num[i][j] = Integer.parseInt(st.nextToken());
                list.add(num[i][j]);
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list.get(N - 1));
    }
}
