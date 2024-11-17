package java_algorithm_study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SSAFY {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int t = 0; t < T; t++) {
            int N = s.nextInt();
            int K = s.nextInt();
            ArrayList<Integer> li = new ArrayList<Integer>();

            for (int i = 0; i < N; i++) {
                li.add(s.nextInt());
            }
            Collections.sort(li);
            ArrayList<int[]> li2 = new ArrayList<int[]>();

            for (int i = 0; i < N; i++) {
                ArrayList<Integer> tmp = new ArrayList<Integer>(li);
                for (int num : tmp) {
                    li2.add(new int[] { num, li.get(i) });
                }
            }

            Collections.sort(li2, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));


            int[] arr = li2.get(K - 1);
            System.out.println("#" + (t + 1) + " " + (arr[0] + arr[1]));
        }
        
    }
}
