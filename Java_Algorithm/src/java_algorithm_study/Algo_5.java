package java_algorithm_study;

import java.util.Scanner;

public class Algo_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		
		int []books=new int[N];
		
		for(int i=0;i<N;i++) {
			books[i]=s.nextInt();
		}
		
		int expect=N;
		int keep=0;
		
		for(int i=N-1;i>=0;i--) {
			if(books[i]==expect) {
				keep++;
				expect--;
			}
		}
		
		System.out.println(N-keep);
	}
	//BJ2872
}
