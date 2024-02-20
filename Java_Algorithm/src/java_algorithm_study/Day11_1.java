package java_algorithm_study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Day11_1 {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int N = s.nextInt();

	       
	        List<Integer> card = new ArrayList<>();

	        
	        LinkedList<Integer> d = new LinkedList<>();
	        for (int i = 1; i <= N; i++) {
	            d.add(i);
	        }

	        
	        while (d.size() > 1) {
	           
	            int delete = d.pollFirst();
	            card.add(delete);

	           int move = d.pollFirst();
	            d.addLast(move);
	        }

	        for (int i = 0; i < card.size(); i++) {
	            System.out.print(card.get(i));
	            if (i != card.size() - 1) {
	                System.out.print(" ");
	            }
	        }
	        
	        System.out.println(" "+d.getFirst());}
	}


