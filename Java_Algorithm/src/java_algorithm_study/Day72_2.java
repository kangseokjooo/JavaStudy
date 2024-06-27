package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day72_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int L = s.nextInt();
        int[] S = new int[L];

        for (int i = 0; i < L; i++) {
            S[i] = s.nextInt();
        }

        int n = s.nextInt();
        Arrays.sort(S);

        // Check if n is in the set S
        for (int i = 0; i < L; i++) {
            if (S[i] == n) {
                System.out.println(0);
                return;
            }
        }

        int l = 0, r = 1001;

        for (int i = 0; i < L; i++) {
            if (S[i] < n) {
                l = S[i];
            }
            if (S[i] > n && r == 1001) {
                r = S[i];
                break;
            }
        }

        int cnt = 0;

        for (int A = l + 1; A <= n; A++) {
            for (int B = n; B < r; B++) {
                cnt++;
            }
        }

        System.out.println(cnt-1);
    }
    //BJ1059
}
