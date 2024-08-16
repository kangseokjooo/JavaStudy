package java_algorithm_study;

import java.util.Scanner;

public class Day100_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		
		int maxLen=0;
		int n=str.length();
		
		for(int i=2;i<=n;i+=2) {
			for(int j=0;j+i<=n;j++) {
				int m=j+i/2;
				String l=str.substring(j, m);
				String r=str.substring(m, j+i);
				
				if(Sum(l)==Sum(r)) {
					maxLen=Math.max(maxLen, i);
				}
			}
		}
		System.out.println(maxLen);
		
	}
	static int Sum(String s) {
		int sum=0;
		for(char c:s.toCharArray()) {
			sum+=c-'0';
		}
		return sum;
	}
	
	//BJ1639
}
