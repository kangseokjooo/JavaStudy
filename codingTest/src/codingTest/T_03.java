package codingTest;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		long N=s.nextLong();
		long mod=1234567;
		long cnt=0;
		long start=1;
		long digit=1;
		
		while(start<=N) {
			long end=start*10-1;
			if(end>N) end=N;
			
			cnt+=(end-start+1)*digit;
			cnt%=mod;
			
			digit++;
			start*=10;
		}
		
		System.out.println(cnt%mod);
		
		
	}
	//BJO S3 활자 
}
