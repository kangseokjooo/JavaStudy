package java_algorithm_study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day67_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt(); 
        int A = s.nextInt(); 
        int B = s.nextInt(); 
        int aKcal = s.nextInt(); 

        Integer[] bKcal = new Integer[N];
        for (int i = 0; i < N; i++) {
            bKcal[i] = s.nextInt();
        }

        Arrays.sort(bKcal, Collections.reverseOrder());

        int totalPrice = A;
        int totalKcal = aKcal;
        int maxKcal = totalKcal / totalPrice;

        for (int i = 0; i < N; i++) {
            totalPrice += B;
            totalKcal += bKcal[i];
            int kcal = totalKcal / totalPrice;
            if (kcal > maxKcal) {
            	maxKcal = kcal;
            } else {
                break;
            }
        }

        System.out.println(maxKcal);
    }
}
