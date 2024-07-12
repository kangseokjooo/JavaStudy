package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day82_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int G = s.nextInt();
        ArrayList<Integer> result = new ArrayList<>();

        for (int a = 1; a * a < G; a++) {
            if (G % a == 0) {
                int b = G / a;
                int x = (a + b) / 2;
                int y = (b - a) / 2;

                if ((a + b) % 2 == 0 && (b - a) % 2 == 0 && x > y) {
                    result.add(x);
                }
            }
        }
        Collections.sort(result);

        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int r : result) {
                System.out.println(r);
            }
        }

    }
    //BJ1484
}
