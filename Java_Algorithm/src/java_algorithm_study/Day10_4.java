package java_algorithm_study;

import java.util.Scanner;

public class Day10_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double A=s.nextDouble();
		double B=s.nextDouble();
		double C=s.nextDouble();
		double num=Math.pow(A, B)%C;
		System.out.println((int)num);
		
	}

}
