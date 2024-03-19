package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day25_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] rope = new int[N];
        for (int i=0;i<N;i++) {
        	rope[i]=s.nextInt();
        }

        Arrays.sort(rope);
        for (int i=0;i<N/2;i++) {
            int tmp=rope[i];
            rope[i]=rope[N-1-i];
            rope[N-1-i]=tmp;
        }

        int max=0;
        for (int i = 0; i < N; i++) {
            int w=rope[i]*(i+1);
            max = Math.max(max, w);
        }
        
        System.out.println(max);
    }
}
