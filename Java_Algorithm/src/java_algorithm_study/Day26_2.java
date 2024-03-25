package java_algorithm_study;

import java.util.Scanner;

public class Day26_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int A=s.nextInt();
		int B=s.nextInt();
		
		int time=N/A;
		
		if(N%A!=0) {
			time++;
		}
		int result=0;
		if(K<time) {
			result=K;
		}else {
			while(true) {
				K-=time;
				if(K < 0) {
					result=result+time+K;
					break;
				}
				K+=B;
				result+=time;
			}
		}
		System.out.println(result);
	}

}
