package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day78_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        

        int L = s.nextInt();
        int T = s.nextInt();
        s.nextLine(); 
        int N = s.nextInt();
        s.nextLine(); 
        

        int[] pos = new int[N + 1];
        char[] dir = new char[N + 1];
        for (int i = 1; i <= N; i++) {
            pos[i] = s.nextInt();
            dir[i] = s.next().charAt(0);
            s.nextLine();
        }
        

        for (int t = 0; t < T; t++) {
            for (int i = 1; i <= N; i++) {
                if (dir[i] == 'D') {
                    pos[i]++;
                } else if (dir[i] == 'L') {
                    pos[i]--;
                }
                
                if (pos[i] == 0 || pos[i] == L) {
                    if (dir[i] == 'D') {
                        dir[i] = 'L';
                    } else {
                        dir[i] = 'D';
                    }
                }
            }
        }
        Arrays.sort(pos);
        for (int i = 1; i <= N; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println();
        
    }
    //BJ3221(시간초과)
}
