package java_algorithm_study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day95_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        s.nextLine();

        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = s.nextLine();
        }

        String[] msword = {"a", "b", "k", "d", "e", "g", "h", "i", "l", "m", "n", "ng", "o", "p", "r", "s", "t", "u", "w", "y"};
        Map<String, Integer> msMap = new HashMap<>();

        for (int i = 0; i < msword.length; i++) {
            msMap.put(msword[i], i);
        }

        Arrays.sort(words, (word1, word2) -> {
            int len1 = word1.length();
            int len2 = word2.length();
            int i = 0, j = 0;
            while (i < len1 && j < len2) {
                String part1 = Minsik(word1, i);
                String part2 = Minsik(word2, j);
                int c = msMap.get(part1).compareTo(msMap.get(part2));
                if (c != 0) {
                    return c;
                }
                i += part1.length();
                j += part2.length();
            }
            return len1 - len2;
        });

        for (String w : words) {
            System.out.println(w);
        }


    }

    static String Minsik(String word, int idx) {
        if (idx < word.length() - 1 && word.substring(idx, idx + 2).equals("ng")) {
            return "ng";
        }
        return String.valueOf(word.charAt(idx));
    }
    //BJ1599(X)
}
