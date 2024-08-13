package java_algorithm_study;

import java.util.Scanner;

public class Day97_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int[] S = new int[N];
        
   
        for (int i = 0; i < N; i++) {
            S[i] = s.nextInt();
        }
        
        int[] candy = new int[N];
        

        int sum = 0;
        for (int i = 1; i < N; i += 2) {
            sum += S[i];
        }
        candy[0] = (S[0] + S[N - 1] - sum) / 2;
        

        for (int i = 1; i < N; i++) {
        	candy[i] = S[i - 1] - candy[i - 1];
        }
        

        for (int i = 0; i < N; i++) {
            System.out.println(candy[i]);
        }
        
        //BJ1812(X)
    }
}
