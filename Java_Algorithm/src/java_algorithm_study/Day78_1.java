package java_algorithm_study;

import java.util.Scanner;

public class Day78_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        

        int n = s.nextInt(); 
        int m = s.nextInt();  
        int t = s.nextInt(); 
        
        int maxB = 0;
        int min = t;
        

        for (int i = 0; i <= t / n; i++) {
            int rTime = t - i * n;
            int bcnt = rTime / m;
            
            int total= i + bcnt;
            int colaT = rTime % m;
            
            if (colaT < min || (colaT == min && total > maxB)) {
            	maxB = total;
            	min = colaT;
            }
        }
        

        System.out.println(maxB + " " + min);
        
    }
    //BJ1980
}
