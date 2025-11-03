package codingTest;

import java.util.*;

public class T_24 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int S=s.nextInt();
		int K=s.nextInt();
		
		int a=S/K;
		int b=S%K;
		
		long answer=1;
		
		for(int i=0;i<K;i++) {
			if(i<b) {
				answer*=(a+1);
			}else {
				answer*=a;
			}
		}
		System.out.println(answer);

	}
	
	//BOJ S2 최대 곱 

}
