package java_algorithm_study;

import java.util.Scanner;

public class Day_12_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long A=s.nextLong();
		long B=s.nextLong();
        long num = 1; 
        
        for (long i = 1; i<= A&&i<= B; i++) {
            if (A % i == 0 && B % i == 0) {
                num = i;
            }
        }
        long result= (A*B)/num;
		System.out.println(result);
	}

}
