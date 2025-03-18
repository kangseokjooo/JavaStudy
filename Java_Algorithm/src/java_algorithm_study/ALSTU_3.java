package java_algorithm_study;

import java.util.Scanner;

public class ALSTU_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int L = s.nextInt();
        int time = 0, pos = 0;
        
        for (int i = 0; i < N; i++) {
            int D = s.nextInt();
            int R = s.nextInt();
            int G = s.nextInt();
            
            time += (D - pos);
            pos = D;
            
            int cycle = R + G;
            int modTime = time % cycle;
            
            if (modTime < R) {
                time += (R - modTime);
            }
        }
        
        time += (L - pos);
        System.out.println(time);
    }
    //BJ2980(O)
}