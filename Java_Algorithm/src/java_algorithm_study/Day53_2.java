package java_algorithm_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day53_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 2 * N; i++) {
            	list.add(sc.nextInt());
            }
            List<Integer> price = new ArrayList<>();
            while (!list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) % 4 == 0 && list.contains((int) (list.get(i) * (3.0 / 4)))) {
                        int a = list.remove(i);
                        int idx = list.indexOf((int) (a * (3.0 / 4)));
                        int b = list.remove(idx);
                        price.add(b);
                        break;
                    }
                }
            }

            StringBuilder res = new StringBuilder();
            for (int p : price) {
                res.append(p).append(" ");
            }
            System.out.println("#" + tc + " " + res);
        }
        sc.close();
    }
}
