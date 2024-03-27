package java_algorithm_study;

import java.util.*;

public class Day29_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int R = s.nextInt();
        int C = s.nextInt();
        s.nextLine();

        char puzzle[][] = new char[R][C];
        for (int i = 0; i < R; i++) {
            String line = s.nextLine();
            for (int j = 0; j < C; j++) {
                puzzle[i][j] = line.charAt(j);
            }
        }

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < R; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < C; j++) {
                if (puzzle[i][j] == '#') {
                    if (sb.length() > 1) {
                        list.add(sb.toString());
                    }
                    sb.setLength(0);
                } else {
                    sb.append(puzzle[i][j]);
                }
            }
            if (sb.length() > 1) {
                list.add(sb.toString());
            }
        }

        for (int i = 0; i < C; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < R; j++) {
                if (puzzle[j][i] == '#') {
                    if (sb.length() > 1) {
                        list.add(sb.toString());
                    }
                    sb.setLength(0);
                } else {
                    sb.append(puzzle[j][i]);
                }
            }
            if (sb.length() > 1) {
                list.add(sb.toString());
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
