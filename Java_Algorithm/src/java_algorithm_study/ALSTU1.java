package java_algorithm_study;

import java.util.Scanner;

public class ALSTU1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int N1=s.nextInt();
		int N2=s.nextInt();
		String G1=s.next();
		String G2=s.next();
		int T=s.nextInt();
		
		StringBuilder sb=new StringBuilder(G1);
		sb.reverse().append(G2);
		char[] ants=sb.toString().toCharArray();
		
		boolean[] r=new boolean[N1+N2];
		for(int i=0;i<N1;i++) r[i]=true;
		for(int i=N1;i<N1+N2;i++) r[i]=false;
		
		while(T-->0) {
			for(int i=0;i<ants.length-1;i++) {
				if(r[i]&&!r[i+1]) {
					char tmp=ants[i];
					ants[i]=ants[i+1];
					ants[i+1]=tmp;
					
					r[i]=false;
					r[i+1]=true;
					
					i++;
				}
			}
		}
		System.out.println(new String(ants));
	}
	//BJ3048
}
