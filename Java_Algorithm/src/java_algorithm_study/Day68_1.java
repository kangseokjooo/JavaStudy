package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day68_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < N; i++) {
            if (!seen.add(arr[i])) {
                duplicates.add(arr[i]);
            }
        }


        if (duplicates.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int value : duplicates) {
                System.out.print(value);
            }
        }

        s.close();
    }
}
