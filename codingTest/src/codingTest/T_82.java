package codingTest;

import java.util.*;

public class T_82 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int[] cnt = new int[26];

        for (char c : str.toCharArray()) {
            cnt[c - 'A']++;
        }

        int odd = 0;
        char m = 0;

        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 == 1) {
                odd++;
                m = (char) (i + 'A');
            }
        }

        if (odd > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder half = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < cnt[i] / 2; j++) {
                half.append((char) (i + 'A'));
            }
        }

        String l = half.toString();
        String r = half.reverse().toString();
        String answer = (odd == 1) ? l + m + r : l + r;

        System.out.println(answer);
    }
    //팰린드롬 만들기 S3
}
