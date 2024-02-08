package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day9_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine().trim();
		String []arr=str.split("\\s");
		
		if (str.isEmpty()) { 
            System.out.println(0);
        } else {
            System.out.println(arr.length); 
        }
	}
	//solved
}
