package java_algorithm_study;

import java.util.Scanner;

public class Day4_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int start=1;
		int end=1;
		int answer=1;
		int sum=1;
		while(end!=N) {
			if(sum == N) {
				answer++;
				end++;
				sum=sum+end;
			}else if(sum > N) {
				sum=sum -start;
				start++;
			}else {
				end++;
				sum=sum+end;
			}
		}
		System.out.println(answer);
	}
	//solved
}
