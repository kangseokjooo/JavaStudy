package java_algorithm_study;

import java.util.*;

public class Algo_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); 
        int B = s.nextInt(); 

        int[][] friends = new int[N][2];

        for (int i = 0; i < N; i++) {
            friends[i][0] = s.nextInt(); 
            friends[i][1] = s.nextInt(); 
        }

        int max = 0;

        for (int i = 0; i < N; i++) {
        
            int[] totalArray = new int[N];
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    totalArray[j] = friends[j][0] / 2 + friends[j][1];
                } else {
                    totalArray[j] = friends[j][0] + friends[j][1]; 
                }
            }

            Arrays.sort(totalArray); 

            long sum = 0;
            int cnt = 0;
            for (int cost : totalArray) {
                sum += cost;
                if (sum > B) break;
                cnt++;
            }

            max = Math.max(max, cnt); 
        }

        System.out.println(max); 
    }
}
