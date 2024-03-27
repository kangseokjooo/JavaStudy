package java_algorithm_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day28_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = prime(100000);
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("0")) {
                break;
            }
            int result = 2;
            for (int n : list) {
                if (str.contains(String.valueOf(n))) {
                    result = n;
                }
            }
            System.out.println(result);
        }
    }

    public static List<Integer> prime(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] isprime = new boolean[n+1];
        for (int i=2;i<=n;i++) {
        	isprime[i] = true;
        }
        for (int i=2;i*i<= n;i++) {
            if (isprime[i]) {
                for (int j =i*i;j<=n;j+=i) {
                	isprime[j] = false;
                }
            }
        }
        for (int i=2;i<=n;i++) {
            if (isprime[i]) {
            	list.add(i);
            }
        }
        return list;
    }
}
