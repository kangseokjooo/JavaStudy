package java_algorithm_study;

import java.util.Scanner;

public class Day87_1 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int T = s.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = s.nextInt();
            int M = s.nextInt();
            
            System.out.println(combination(M, N));
        }
        
    }

    public static long combination(int m, int n) {
  
        if (n == 0 || m == n) {
            return 1;
        }
        
        long result = 1;
        
  
        for (int i = 0; i < n; i++) {
            result *= (m - i);
            result /= (i + 1);
        }
        
        return result;
    }
    //BJ1010
}
