package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day73_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = s.nextInt();
        }
        Arrays.sort(size);
        
        int cnt = 0;
        int right = 0;

        for (int left = 0; left < n; left++) {
            while (right < n && size[right] <= size[left] * 10 / 9.0) {
                right++;
            }
            cnt += (right - left - 1);
        }
        
        System.out.println(cnt);
    }
    //BJ2428
}
