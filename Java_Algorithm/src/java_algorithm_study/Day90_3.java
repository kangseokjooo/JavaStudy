package java_algorithm_study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day90_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int U = s.nextInt();
        int N = s.nextInt();

        Map<Integer, Integer> priceCount = new HashMap<>();
        Map<Integer, String> firstName = new HashMap<>();
        int[] firstIdx = new int[U + 1]; 

        for (int i = 0; i < N; i++) {
            String name = s.next();
            int p = s.nextInt();

            priceCount.put(p, priceCount.getOrDefault(p, 0) + 1);

            if (!firstName.containsKey(p)) {
                firstName.put(p, name);
                firstIdx[p] = i; 
            }
        }

        int minCnt = Integer.MAX_VALUE;
        int minPrice = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : priceCount.entrySet()) {
            int price = entry.getKey();
            int count = entry.getValue();

            if (count < minCnt || (count == minCnt && price < minPrice)) {
                minCnt = count;
                minPrice = price;
            }
        }

        String result = firstName.get(minPrice);
        System.out.println(result + " " + minPrice);
    }
   //BJ2238
}
