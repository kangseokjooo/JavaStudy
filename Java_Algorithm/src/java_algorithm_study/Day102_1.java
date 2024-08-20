package java_algorithm_study;

import java.util.Scanner;

public class Day102_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N=s.nextInt();
		
		String []Q=new String[N];
		int []strike=new int[N];
		int []ball=new int[N];
		
		for(int i=0;i<N;i++) {
			Q[i]=s.next();
			strike[i]=s.nextInt();
			ball[i]=s.nextInt();
		}
		int possible=0;
		
		for(int i=123;i<=987;i++) {
			String c=String.valueOf(i);
			
			if(c.contains("0")||c.charAt(0)==c.charAt(1)||c.charAt(1)==c.charAt(2)||c.charAt(0)==c.charAt(2)) {
				continue;
				
			}
			boolean isValid=true;
			
			for(int j=0;j<N;j++) {
				int []result=Strike(Q[j],c);
				if(result[0]!=strike[j]||result[1]!=ball[j]) {
					isValid=false;
					break;
				}
			}
			if(isValid) {
				possible++;
			}
		}
		System.out.println(possible);
	}
	static int[] Strike(String g,String t) {
		int strike=0,ball=0;
		for(int i=0;i<3;i++) {
			if(g.charAt(i)==t.charAt(i)) {
				strike++;
			}else if(t.contains(String.valueOf(g.charAt(i)))) {
				ball++;
			}
		}
		return new int[] {strike,ball};
	}
	//BJ2503
}
