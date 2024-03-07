package java_algorithm_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day19_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int sIdx = 0;
        int eIdx = N - 1;

        int max = Integer.MAX_VALUE;

        int x1 = 0;
        int x2 = 0;

        while (sIdx < eIdx) {
            int sum = arr[sIdx] + arr[eIdx];

            if (Math.abs(max) >= Math.abs(sum)) {
                max = sum;
                x1 = arr[sIdx];
                x2 = arr[eIdx];
            }

            if (sum < 0) {
                sIdx++;
            } else if (sum > 0) {
                eIdx--;
            } else {
                break;
            }
        }
        System.out.println(x1 + " " + x2);
    }
}
