package java_algorithm_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algo_28 {
	static long gcd(long a, long b) {
		while(b!=0) {
			long tmp=a%b;
			a=b;
			b=tmp;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long R=s.nextLong();
		long G=s.nextLong();
		
		long value=gcd(R,G);
		
		List<Long> list=new ArrayList<Long>();
		
		for(long i=1;i*i<=value;i++) {
			if(value%i==0){
				list.add(i);
				
				if(i!=value/i) {
					list.add(value/i);
				}
			}
		}
		for(long n:list) {
			long r=R/n;
			long g=G/n;
			System.out.println(n+" "+r+" "+g);
		}
	}
	//BJ2942(O)
}
