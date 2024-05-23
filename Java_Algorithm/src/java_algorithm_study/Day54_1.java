package java_algorithm_study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Day54_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = s.nextInt(); 
            ArrayList<Integer> scores = new ArrayList<>(); 


            for (int i = 0; i < N; i++) {
                scores.add(s.nextInt());
            }

            HashSet<Integer> possible = new HashSet<>(); 
            
            possible.add(0); 

  
            for (int i = 0; i < N; i++) {
                HashSet<Integer> tmp = new HashSet<>(possible); 
                for (int score : tmp) {
                	possible.add(score + scores.get(i)); 
                    }
            }
            System.out.println("#"+(t+1)+" "+possible.size());
        }
    }
}
