package java_algorithm_study;

import java.util.Scanner;

public class Algo_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int g = gcd(N, M);
        System.out.println(M - g); 
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    //BJ1188
}
