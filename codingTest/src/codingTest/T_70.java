package codingTest;

import java.util.*;

public class T_70 {
    static int N, M;
    static String arr[];
    static int max;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int tc = 0; tc < t; tc++) {
            N = s.nextInt();
            M = s.nextInt(); 
            arr = new String[N];
            for (int i = 0; i < N; i++) arr[i] = s.next();

            max = 0;
            combine(0, "");
            System.out.println("#" + (tc+1) + " " + max);
        }
    }

 
    static void combine(int idx, String sum) {
        if (idx == N) {
            if (isPalindrome(sum)) {
            	max = Math.max(max, sum.length());
            }
            return;
        }

     
        combine(idx + 1, sum + arr[idx]);
        combine(idx + 1, sum);
    }

    static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
   //SWEA 팰린드롬 구하기 D3 (시간 초과)
}
