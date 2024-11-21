package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[][] classes = new int[N + 1][6]; 


        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 5; j++) {
                classes[i][j] = s.nextInt();
            }
        }

        int max = 0;
        int leader = 1; 

       
        for (int i = 1; i <= N; i++) {
            int cnt = 0;

            for (int j = 1; j <= N; j++) {
                if (i == j) continue; 

                
                boolean isSame = false;
                for (int k = 1; k <= 5; k++) {
                    if (classes[i][k] == classes[j][k]) {
                    	isSame = true;
                        break; 
                    }
                }

                if (isSame) {
                    cnt++; 
                }
            }


            if (cnt > max || (cnt == max && i < leader)) {
                max = cnt;
                leader = i;
            }
        }

        System.out.println(leader);
    }
}
