package java_algorithm_study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Day37_1 {

    static class Meeting {
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        Meeting[] meet = new Meeting[N];
        for (int i = 0; i < N; i++) {
            int start = s.nextInt();
            int end = s.nextInt();
            meet[i] = new Meeting(start, end);
        }
        Arrays.sort(meet, Comparator.comparingInt((Meeting m) -> m.end).thenComparingInt(m -> m.start));
        int cnt = 0;
        int endtime=0;
        for (int i = 0; i < N; i++) {
            if(endtime <= meet[i].start) {
            	endtime=meet[i].end;
            	cnt++;
            }
        }

        System.out.println(cnt);
    }
}
