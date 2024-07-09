package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day79_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        int arr[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int start = arr[i];
                int end = arr[j];
                
                int size = j - i + 1;
                int nsize = end - start + 1;
                if (nsize <= 5) {
                    int a = 5 - size;
                    min = Math.min(min, a);
                }
            }
        }

        System.out.println(min);
        s.close();
    }
    //BJ1337
}
