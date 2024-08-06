package java_algorithm_study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day94_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int K = s.nextInt();

        char[] arr = new char[N];
        Arrays.fill(arr, '?');

        Map<Character, Integer> smap = new HashMap<>();
        int cur = 0;
        boolean isPossible = true;

        for (int i = 0; i < K; i++) {
            int S = s.nextInt();
            char C = s.next().charAt(0);

            cur = (cur + S) % N;

            if (arr[cur] == '?') {
                arr[cur] = C;
                if (smap.containsKey(C)) {
                    isPossible = false;
                    break;
                } else {
                    smap.put(C, cur);
                }
            } else if (arr[cur] != C) {
                isPossible = false;
                break;
            }
        }

        if (!isPossible) {
            System.out.println("!");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = N - 1; i >= 0; i--) {
                sb.append(arr[(cur + i + 1) % N]);
            }
            System.out.println(sb.toString());
        }


    }
    //BJ2840
}
