package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day73_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        long[] size = new long[n];
        for (int i = 0; i < n; i++) {
            size[i] = s.nextLong();
        }
        Arrays.sort(size);
        
        int cnt = 0;
        int left = 0, right = 0;
        
        while (left < n) {
            while (right < n && size[right] < size[left] * 10 / 9.0) {
                right++;
            }
            cnt += (right - left - 1);
            left++;
        }
        
        System.out.println(cnt);
    }
   //BJ2428
}
