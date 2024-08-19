package java_algorithm_study;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day101_1 {
    static boolean[] isPrime;

    static void S(int max) {
        isPrime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    static void permute(String str1, String str2, Set<Integer> primes) {
        if (!str1.equals("")) {
            int num = Integer.parseInt(str1);
            if (isPrime[num]) {
                primes.add(num);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            permute(str1 + str2.charAt(i), str2.substring(0, i) + str2.substring(i + 1), primes);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        s.nextLine();      

    
        S(9999999);

 
        for (int i = 0; i < c; i++) {
            String input = s.nextLine(); 
            Set<Integer> primes = new HashSet<>();

            permute("", input, primes);


            System.out.println(primes.size());
        }

//BJ3671(X)
    }
}
