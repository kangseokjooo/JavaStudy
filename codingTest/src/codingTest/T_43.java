package codingTest;

import java.util.*;

public class T_43 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int arr[] = new int[N]; 

        for (int i = 0; i < N; i++) arr[i] = s.nextInt();

        int[] score = new int[N]; 
        for (int i = 0; i < score.length; i++) {
            score[i] = i + 1;
        }

        for (int i = 0; i < N; i++) {
            int B = 0;
            int C = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                if (score[j] < score[i] && arr[j] > arr[i]) B++;

                if (score[j] > score[i] && arr[j] < arr[i]) C++;
            }
            System.out.println(B - C);
        }
        
        //BOJ S1 알고리즘 기말고사(X)
       
    }
}
