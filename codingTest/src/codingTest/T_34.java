package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class T_34 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		for(int tc=0;tc<t;tc++) {
			int a=s.nextInt();
			long dp[]=new long[10];
			Arrays.fill(dp, 1);
			
			for(int d=2;d<=a;d++) {
				long ndp[]=new long[10];
				ndp[0]=dp[0];
				
				for(int i=1;i<=9;i++) {
					ndp[i]=ndp[i-1]+dp[i];
				}
				dp=ndp;
			}
			
			long cnt=0;
			for(long c:dp) cnt+=c;
			
			System.out.println(cnt);
		}
	}
	
	//BOJ S1 줄어들지 않아 

}
