package codingTest;
import java.util.*;
public class T_79 {
    static int arr[] = {1, 2, 3, 4, 5};
    static int S = 3;
    static int cnt = 0;
    static boolean visited[] = new boolean[arr.length];

    public static void main(String[] args) {
        bt(0, 0);
        System.out.println(cnt);
    }

    static void bt(int depth, int sum) {
        if (sum == S) {     // 합 맞으면 카운트
            cnt++;
            return;
        }

        if (sum > S) return; // 더해봤자 의미 없으면 종료

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                bt(depth + 1, sum + arr[i]);
                visited[i] = false;
            }
        }
    }
}