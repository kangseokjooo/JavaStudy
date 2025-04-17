package java_algorithm_study;

import java.util.*;

public class ALSTU_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[][] customer = new int[N][2];
        
        Set<Integer> buyer = new HashSet<>();
        for (int i = 0; i < N; i++) {
            customer[i][0] = s.nextInt(); 
            customer[i][1] = s.nextInt(); 
            buyer.add(customer[i][0]);
        }
        
        int max = 0;
        int bp = 0;
        
        for (int price : buyer) {
            int total = 0;
            int count = 0;
            for (int[] c : customer) {
                if (c[0] >= price && price - c[1] > 0) { 
                    total += price - c[1];
                    count++;
                }
            }
            if (count > 0 && total > max) {
                max = total;
                bp = price;
            } else if (count > 0 && total == max && price < bp) {
                bp = price;
            }
        }
        
        System.out.println(max > 0 ? bp : 0);
    }
    //BJ1487(O)
}