package java_algorithm_study;

import java.util.Scanner;

public class Day52_1 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            String s = sc.next();
            int K = sc.nextInt();

            double[] prob = new double[3];
            prob[0] = s.charAt(0) == 'o' ? 1 : 0;
            prob[1] = s.charAt(1) == 'o' ? 1 : 0;
            prob[2] = s.charAt(2) == 'o' ? 1 : 0;

            for (int k = 0; k < K; k++) {
                double[] newProb = new double[3];
                newProb[0] += 0.5 * prob[1];
                newProb[1] += 0.5 * prob[0];
                newProb[1] += 0.5 * prob[2];
                newProb[2] += 0.5 * prob[1];
                prob = newProb;
            }

            int maxIndex = 0;
            for (int i = 1; i < 3; i++) {
                if (prob[i] > prob[maxIndex]) {
                    maxIndex = i;
                }
            }

            System.out.println("#" + test_case + " " + maxIndex);
        }
    }
}
