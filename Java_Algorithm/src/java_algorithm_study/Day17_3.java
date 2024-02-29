package java_algorithm_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day17_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[20000001]; // 숫자 범위: -10,000,000 ~ 10,000,000

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            cards[num + 10000000]++; // 음수를 인덱스로 사용하지 않기 위해 10,000,000을 더함
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(cards[num + 10000000]).append(" ");
        }
        System.out.println(sb.toString());
    }
}

