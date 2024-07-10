package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day80_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while (true) {
            int n = s.nextInt();
            
            if (n == 0) break;
            
            int[] sta = new int[n];
            
            for (int i = 0; i < n; i++) {
                sta[i] = s.nextInt();
            }
            System.out.println(isPossible(sta) ? "POSSIBLE" : "IMPOSSIBLE");
        }
        
    }
    
    static boolean isPossible(int[] sta) {
        Arrays.sort(sta);
        
        for (int i = 1; i < sta.length; i++) {
            if (sta[i] - sta[i - 1] > 200) {
                return false;
            }
        }
        
     
        int distEnd = 1422 - sta[sta.length - 1];
        if (distEnd > 200) {
            return false;
        }
        
      
        if (distEnd * 2 > 200) {
            return false;
        }
        
        return true;
    }
    //BJ4159
}
