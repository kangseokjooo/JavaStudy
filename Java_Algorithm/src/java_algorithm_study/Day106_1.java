package java_algorithm_study;

import java.util.Scanner;

public class Day106_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int[] freq = new int[26]; 

        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        System.out.println(permute(freq, "", str.length(), '\0'));
    }

    static int permute(int[] freq, String p, int r, char last) {
        if (r == 0) {
            return 1; 
        }

        int cnt = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0 && (char)(i + 'a') != last) {  
                freq[i]--;
                cnt += permute(freq, p + (char)(i + 'a'), r - 1, (char)(i + 'a'));
                freq[i]++;
            }
        }

        return cnt;
    }
    //BJ1342
}
