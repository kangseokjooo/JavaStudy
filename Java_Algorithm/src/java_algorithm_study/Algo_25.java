package java_algorithm_study;

import java.util.Scanner;

public class Algo_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String P = sc.nextLine();

        int cnt = 0;
        int i = 0;
        int pLen = P.length();

        while (i < pLen) {
            int maxLen = 0;

            for (int len = 1; i + len <= pLen; len++) {
                String sub = P.substring(i, i + len);
                if (S.contains(sub)) {
                    maxLen = len;
                }
            }

      
            i += maxLen;
            cnt++;
        }

        System.out.println(cnt);
    }
    //BJ2195
}
