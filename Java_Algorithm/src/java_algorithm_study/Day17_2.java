package java_algorithm_study;

import java.util.HashMap;
import java.util.Scanner;

public class Day17_2 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	       int N = s.nextInt();
	        HashMap<Integer, Integer> cards = new HashMap<>();
	        for (int i = 0; i < N; i++) {
	            int num = s.nextInt();
	            if (cards.containsKey(num)) {
	                cards.put(num, cards.get(num) + 1);
	            } else {
	                cards.put(num, 1);
	            }
	        }
	        
	        int M = s.nextInt();
	        for (int i = 0; i < M; i++) {
	            int num = s.nextInt();
	            if (cards.containsKey(num)) {
	                System.out.print(cards.get(num) + " ");
	            } else {
	                System.out.print("0 ");
	            }
	        }
	}

}
