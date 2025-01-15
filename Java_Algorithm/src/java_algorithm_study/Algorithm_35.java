package java_algorithm_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithm_35 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        List<int[]> balloons = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int value = s.nextInt();
            balloons.add(new int[]{i, value});
        }

        StringBuilder sb = new StringBuilder();
        int idx = 0;

        while (!balloons.isEmpty()) {
            int[] cur = balloons.remove(idx); 
            sb.append(cur[0]).append(" ");   
            int move = cur[1];              

            if (balloons.isEmpty()) break;   

            if (move > 0) {
                idx = (idx + (move - 1)) % balloons.size(); 
            } else {
                idx = (idx + move) % balloons.size();       
                if (idx < 0) idx += balloons.size();        
            }
        }

        System.out.println(sb.toString().trim());
    }
    //BJ2346
}
