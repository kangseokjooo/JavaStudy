package java_algorithm_study;

import java.util.Scanner;

public class Day15_3 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        int cnt=0;
	        int num=666;
	        while (true) {
	            if (String.valueOf(num).contains("666")) {
	            	cnt++;
	                if (cnt==N) {
	                    System.out.println(num);
	                    break;
	                }
	            }
	            num++;
	        }

	}

}
