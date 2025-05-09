package java_algorithm_study;

import java.util.*;

public class Algo_23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        Integer[] prices = new Integer[N];
        
        for (int i = 0; i < N; i++) {
            prices[i] = s.nextInt();
        }

        Arrays.sort(prices, Collections.reverseOrder()); 

        int total = 0;
        for (int i = 0; i < N; i++) {
            if (i % 3 != 2) { 
                total += prices[i];
            }
        }

        System.out.println(total);
    }
}
