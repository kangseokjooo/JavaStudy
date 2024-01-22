package java_algorithm_study;

import java.io.IOException;
import java.util.Scanner;

public class Day5_1 {
    static int[] cArr;
    static int[] mArr;
    static int cs;

    public static void main(String[] args) throws NumberFormatException,IOException {
        Scanner s = new Scanner(System.in);

        int S = s.nextInt();
        int P = s.nextInt();
        int answer = 0;
        char A[] = new char[S];
        cArr = new int[4];
        mArr = new int[4];
        cs = 0;

        for (int i = 0; i < S; i++) {
            A[i] = s.nextLine().charAt(0);
        }

        for (int i = 0; i < 4; i++) {
            cArr[i] = s.nextInt();
            if (cArr[i] == 0) {
                cs++;
            }
        }

        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }

        if (cs == 4)
            answer++;

        for (int i = P; i < S; i++) {
            int j = i - P;
            Add(A[i]);
            Delete(A[j]);
            if (cs == 4)
                answer++;
        }

        System.out.println(answer);
        s.close();
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                mArr[0]++;
                if (mArr[0] == cArr[0])
                    cs++;
                break;
            case 'C':
                mArr[1]++;
                if (mArr[1] == cArr[1])
                    cs++;
                break;
            case 'G':
                mArr[2]++;
                if (mArr[2] == cArr[2])
                    cs++;
                break;
            case 'T':
                mArr[3]++;
                if (mArr[3] == cArr[3])
                    cs++;
                break;
        }
    }

    private static void Delete(char c) {
        switch (c) {
            case 'A':
                if (mArr[0] == cArr[0])
                    cs--;
                mArr[0]--;
                break;
            case 'C':
                if (mArr[1] == cArr[1])
                    cs--;
                mArr[1]--;
                break;
            case 'G':
                if (mArr[2] == cArr[2])
                    cs--;
                mArr[2]--;
                break;
            case 'T':
                if (mArr[3] == cArr[3])
                    cs--;
                mArr[3]--;
                break;
        }
    }
}
