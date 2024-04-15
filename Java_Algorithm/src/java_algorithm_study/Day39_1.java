package java_algorithm_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day39_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] times = new long[N];

        long maxT = 0;
        long minT = Long.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            times[i] = Long.parseLong(br.readLine());
            maxT = Math.max(maxT, times[i]);
            minT = Math.min(minT, times[i]);
        }

        long l = minT;
        long r = maxT * M;

        while (l <= r) {
            long m = (l + r) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += m / times[i];
            }
            if (sum >= M) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        //unsolved
        System.out.println(l);
    }
}
