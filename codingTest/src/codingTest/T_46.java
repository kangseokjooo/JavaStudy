package codingTest;

import java.util.*;

public class T_46 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long A=s.nextLong();
		long B=s.nextLong();
		StringBuilder answer=new StringBuilder();
		long g=gcd(A,B);
		
		for(int i=0;i<g;i++) {
			answer.append('1');
		}
		System.out.println(answer.toString());
	}
	static long gcd(long a,long b) {
		while(b!=0) {
			long tmp=b;
			b=a%b;
			a=tmp;
		}
		return a;
	}
	//BOJ S1 최대공약수

}
