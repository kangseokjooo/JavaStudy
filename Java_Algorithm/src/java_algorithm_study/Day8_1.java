package java_algorithm_study;

import java.util.Arrays;
import java.util.Scanner;

public class Day8_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str1[]=str.split("-");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str1.length;i++) {
			sb.append(str1[i].charAt(0));
		}
		System.out.println(sb.toString());
	}

}
