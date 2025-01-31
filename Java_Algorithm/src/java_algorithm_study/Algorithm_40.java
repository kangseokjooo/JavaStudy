package java_algorithm_study;

import java.util.*;

public class Algorithm_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int a = sc.nextInt();  
        int b = sc.nextInt();  

        Set<Long> pointSet = new HashSet<>(n);

        final long SHIFT = 1_000_000_007L;


        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            pointSet.add((long) x * SHIFT + y);
        }

        int count = 0;


        for (long key : pointSet) {
            int x1 = (int) (key / SHIFT);
            int y1 = (int) (key % SHIFT);

            int x2 = x1 + a, y2 = y1;
            int x3 = x1, y3 = y1 + b;
            int x4 = x1 + a, y4 = y1 + b;


            if (pointSet.contains((long) x2 * SHIFT + y2) &&
                pointSet.contains((long) x3 * SHIFT + y3) &&
                pointSet.contains((long) x4 * SHIFT + y4)) {
                count++;
            }
        }

        System.out.println(count);
      
    }
    //BJ2121(메모리 초과) 
}
