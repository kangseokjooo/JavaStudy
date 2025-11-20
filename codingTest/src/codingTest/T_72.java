package codingTest;

import java.util.Scanner;

public class T_72 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        for (int tc = 0; tc < t; tc++) {
            int N = s.nextInt();
            int P = s.nextInt();

            int sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += i;
                if (sum == P) {  
                    sum--;
                }
            }

            System.out.println(sum);
        }
    }
    
    //높은 곳으로 SWEA D3
}
