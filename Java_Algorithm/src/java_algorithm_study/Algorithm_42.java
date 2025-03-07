package java_algorithm_study;

import java.util.Scanner;

public class Algorithm_42 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		int qc=0;
		int hc=0;
		int tc=0;
		
		for(int i=0;i<N;i++) {
			String str=s.next();
			if(str.equals("1/4")) {
				qc++;
			}else if(str.equals("1/2")) {
				hc++;
			}else if(str.equals("3/4")) {
				tc++;
			}
		}
		int pizza=0;
		
		pizza+=tc;
		qc-=Math.min(tc, qc);
		
		pizza+=hc/2;
		hc%=2;
		
		if(hc>0) {
			pizza++;
			qc-=Math.min(2, qc);
		}
		
		pizza+=(qc+3)/4;
		
		System.out.println(pizza);
	}
	//BJ3213
}
