package java_algorithm_study;

import java.util.*;

public class ALSTU_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }
        
        System.out.println(Ship(N, arr));
    }
    
    public static int Ship(int N, int[] arr) {
        int result = 0;
        boolean[] visited = new boolean[N];
        
        for (int i = 1; i < N; i++) {
            if (visited[i]) continue; 
            int interval = arr[i] - arr[0];
            int tmp = 1;
            
            for (int j = 1; j < N; j++) {
                if (visited[j]) continue;
                if ((arr[j] - arr[0]) % interval == 0) {
                    visited[j] = true;
                    tmp++;
                }
            }
            
            if (tmp > 1) {
            	result++;
            }
        }
        return result;
    }
    //BJ2853(X)
}
