package java_algorithm_study;

import java.util.Scanner;

public class Day9_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int L = scanner.nextInt();
        int round=1;
        while (Math.abs(K - L) != 1 || Math.max(K, L) % 2 != 0) {
            K = (K + 1) / 2;
            L = (L + 1) / 2;
            round++;
        }
        System.out.println(round);
    }
}



