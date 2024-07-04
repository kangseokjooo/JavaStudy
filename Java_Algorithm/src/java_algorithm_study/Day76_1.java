package java_algorithm_study;

import java.util.Scanner;

public class Day76_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		int tc[]=new int[T];
		
		for(int i=0;i<T;i++) {
			tc[i]=s.nextInt();
		}
		
		int [][]fib=new int[41][2];
		
		fib[0][0] = 1; 
        fib[0][1] = 0; 
        fib[1][0] = 0; 
        fib[1][1] = 1;
        
        for (int i = 2; i <= 40; i++) {
            fib[i][0] = fib[i - 1][0] + fib[i - 2][0];
            fib[i][1] = fib[i - 1][1] + fib[i - 2][1];
        }
        
        for (int i = 0; i < T; i++) {
            int n = tc[i];
            System.out.println(fib[n][0] + " " + fib[n][1]);
        }
	}
	//BJ1003
}
