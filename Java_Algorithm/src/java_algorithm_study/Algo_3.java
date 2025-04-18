package java_algorithm_study;

import java.util.*;

public class Algo_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();

        BitSet[] map = new BitSet[N + 1]; 
        for (int i = 1; i <= N; i++) {
            map[i] = new BitSet(N + 1); 
        }

        for (int i = 0; i < M; i++) {
            int l = s.nextInt();
            int r = s.nextInt();
            map[l].set(r); 
        }

        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                BitSet common = (BitSet) map[i].clone(); 
                common.and(map[j]);

                int size = common.cardinality(); 
                if (size >= 2) {
                    cnt += (size * (size - 1)) / 2;
                }
            }
        }

        System.out.println(cnt);
    }
    //BJ3096(X)
}
