package java_algorithm_study;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Algorithm_33 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Object[]> nums = new ArrayList<>();
        int M = s.nextInt();
        int N = s.nextInt();

  
        for (int i = M; i <= N; i++) {
            nums.add(new Object[]{i, toEng(i)});
        }

        nums.sort(Comparator.comparing(a -> (String) a[1]));

        int cnt = 0;


        for (Object[] num : nums) {
            System.out.print(num[0] + " ");
            cnt++;
            if (cnt % 10 == 0) {
                System.out.println();
            }
        }
        if (cnt % 10 != 0) {
            System.out.println();
        }
    }


    static String toEng(int num) {
        String[] words = {"zero", "one", "two", "three", "four",
                          "five", "six", "seven", "eight", "nine"};

        StringBuilder sb = new StringBuilder();

        for (char c : String.valueOf(num).toCharArray()) {
            sb.append(words[c - '0']).append(" ");
        }
        return sb.toString().trim();
    }
    //BJ1715
}
